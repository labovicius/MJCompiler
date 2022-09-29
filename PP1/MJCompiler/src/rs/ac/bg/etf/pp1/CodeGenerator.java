package rs.ac.bg.etf.pp1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.CounterVisitor.FormParamCounter;
import rs.ac.bg.etf.pp1.CounterVisitor.VarCounter;
import rs.ac.bg.etf.pp1.ast.AddopCho;
import rs.ac.bg.etf.pp1.ast.ConstBool;
import rs.ac.bg.etf.pp1.ast.ConstChar;
import rs.ac.bg.etf.pp1.ast.ConstNum;
import rs.ac.bg.etf.pp1.ast.DesignatorEx;
import rs.ac.bg.etf.pp1.ast.Div;
import rs.ac.bg.etf.pp1.ast.DsgStmtDec;
import rs.ac.bg.etf.pp1.ast.DsgStmtEqual;
import rs.ac.bg.etf.pp1.ast.DsgStmtInc;
import rs.ac.bg.etf.pp1.ast.LeftQuest;
import rs.ac.bg.etf.pp1.ast.MethodDecl;
import rs.ac.bg.etf.pp1.ast.MethodT;
import rs.ac.bg.etf.pp1.ast.MethodV;
import rs.ac.bg.etf.pp1.ast.Minus;
import rs.ac.bg.etf.pp1.ast.MinusExpression;
import rs.ac.bg.etf.pp1.ast.Mod;
import rs.ac.bg.etf.pp1.ast.Mul;
import rs.ac.bg.etf.pp1.ast.MulopFactorCho;
import rs.ac.bg.etf.pp1.ast.NewTypeArr;
import rs.ac.bg.etf.pp1.ast.Plus;
import rs.ac.bg.etf.pp1.ast.PrintNumStmt;
import rs.ac.bg.etf.pp1.ast.PrintStmt;
import rs.ac.bg.etf.pp1.ast.ReadStmt;
import rs.ac.bg.etf.pp1.ast.RightQuest;
import rs.ac.bg.etf.pp1.ast.SyntaxNode;
import rs.ac.bg.etf.pp1.ast.TermFact;
import rs.ac.bg.etf.pp1.ast.Var;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;

public class CodeGenerator extends VisitorAdaptor {

	private int mainPc;
	private boolean errorDetected = false;

	enum Addop {
		ADD, SUB
	};

	enum Mulop {
		MUL, DIV, REM
	};

	private Stack<Addop> addopStack = new Stack<Addop>();
	private Stack<Mulop> mulopStack = new Stack<Mulop>();
	
	
	private int pomoc1 = 0, pomoc2 = 0, pomoc3 = 0;
	
	Var pom1;
	ConstNum pomconst1;

	Logger log = Logger.getLogger("info");
	Logger loge = Logger.getLogger("error");

	private Obj program;
	private String currMethod = "";
	private Obj currentMethod = null;

	public int getMainPc() {
		return mainPc;
	}

	public boolean getErrorDetected() {
		return errorDetected;
	}

	public CodeGenerator(Obj prog) {
		program = prog;
	}

	public void report_error(String message, SyntaxNode info) {
		errorDetected = true;
		StringBuilder msg = new StringBuilder(message);
		int line = (info == null) ? 0 : info.getLine();
		if (line != 0)
			msg.append(" na liniji ").append(line);
		loge.error(msg.toString());
	}

	public void report_info(String message, SyntaxNode info) {
		StringBuilder msg = new StringBuilder(message);
		int line = (info == null) ? 0 : info.getLine();
		if (line != 0)
			msg.append(" na liniji ").append(line);
		log.info(msg.toString());
	}

	public Obj getVar(String name, boolean isMethod) {
		Obj obj = Tab.find(name);
		if (obj == Tab.noObj) {
			Collection<Obj> localsProgram = program.getLocalSymbols();
			Iterator<Obj> iter = localsProgram.iterator();
			
			while (iter.hasNext()) {
				obj = iter.next();
				if (isMethod == true && obj.getKind() == Obj.Meth && obj.getName().equals(name)) {
					return obj;
				} else if (isMethod == false && obj.getKind() != Obj.Meth && obj.getName().equals(name)) {
					return obj;
				}
			} 

			
			Collection<Obj> localsMethod = currentMethod.getLocalSymbols();
			iter = localsMethod.iterator();
			while (iter.hasNext()) {
				obj = iter.next();
				if (obj.getName().equals(name))
					return obj;
			}
			obj = null;

		} else {
			return obj;
		}
		return null;
	}


	public void visit(ConstNum constNum) {
		
		if(constNum.getParent().getParent().getParent().getClass() == LeftQuest.class) {
			pomconst1 = constNum;
		}
		
		Code.loadConst(constNum.getN1());
	}

	public void visit(ConstChar constChar) {
		Code.loadConst(constChar.getC1());
	}

	public void visit(ConstBool constBool) {
		Code.loadConst(constBool.getB1() ? 1 : 0);
	}

	public void visit(MethodDecl methDecl) {
		Code.put(Code.exit);
		Code.put(Code.return_);
		currMethod = "";
		currentMethod = null;
	}

	public void visit(MethodV methVoid) {
		if (methVoid.getNameMeth().equals("main")) {
			mainPc = Code.pc;
		}
		methVoid.obj.setAdr(Code.pc);

		currMethod = methVoid.getNameMeth();
		currentMethod = getVar(currMethod, true);
		
		SyntaxNode fja = methVoid.getParent();

		VarCounter vc = new VarCounter();
		fja.traverseTopDown(vc);

		FormParamCounter fc = new FormParamCounter();
		fja.traverseTopDown(fc);

		Code.put(Code.enter);
		Code.put(fc.getCount());
		Code.put(fc.getCount() + vc.getCount());
	}
	
	public void visit(MethodT methType) {
		methType.obj.setAdr(Code.pc);
		SyntaxNode fja = methType.getParent();

		currMethod = methType.getNameMeth();
		currentMethod = getVar(currMethod, true);
	
		VarCounter vc = new VarCounter();
		fja.traverseTopDown(vc);

		FormParamCounter fc = new FormParamCounter();
		fja.traverseTopDown(fc);

		Code.put(Code.enter);
		Code.put(fc.getCount());
		Code.put(fc.getCount() + vc.getCount());

	}
	
	public void visit(PrintStmt printStmt) {
		if (printStmt.getExpr().struct == Tab.intType || printStmt.getExpr().struct == SemanticPass.boolType) {
			Code.loadConst(5); 
			Code.put(Code.print);
		} else {
			Code.loadConst(1);
			Code.put(Code.bprint);
		}
	}

	public void visit(PrintNumStmt printStmt) {
		if (printStmt.getExpr().struct == Tab.intType || printStmt.getExpr().struct == SemanticPass.boolType) {
			Code.loadConst(printStmt.getN2());
			Code.put(Code.print);
		} else {
			Code.loadConst(printStmt.getN2());
			Code.put(Code.bprint);
		}
	}

	public void visit(ReadStmt readStmt) {
		if (readStmt.getDesignator().obj.getType() == Tab.charType)
			Code.put(Code.bread);
		else
			Code.put(Code.read);
		Code.store(readStmt.getDesignator().obj);
	}
	
	
	public void visit(DsgStmtInc dsgInc) {
		if (dsgInc.getDesignator().obj.getKind() == Obj.Elem) {
			Code.put(Code.dup2);
		}
		Code.load(dsgInc.getDesignator().obj);
		Code.loadConst(1);
		Code.put(Code.add);
		Code.store(dsgInc.getDesignator().obj);	
	}
	public void visit(DsgStmtDec dsgDec) {
		if(dsgDec.getDesignator().obj.getKind() == Obj.Elem) {
			Code.put(Code.dup2);
		}
		Code.load(dsgDec.getDesignator().obj);
		Code.loadConst(1);
		Code.put(Code.sub);
		Code.store(dsgDec.getDesignator().obj);		
	}
	
	public void visit(DsgStmtEqual dsgEq) {
			Code.store(dsgEq.getDesignator().obj);
	}
	
	public void visit(Var var) {
		Code.load(var.getDesignator().obj);
		
		if(var.getParent().getParent().getParent().getClass() == LeftQuest.class) {
			pom1 = var;
		}
	}
		
	public void visit(DesignatorEx desigEx) {
		
		Obj ret = getVar(desigEx.getDesigName(), false);
		if (ret != null) {
			Code.load(ret);
			Code.put(Code.dup_x1);
			Code.put(Code.pop);			
		}
	}

	public void visit(Plus plus) {
		addopStack.push(Addop.ADD);
	}

	public void visit(Minus minus) {
		addopStack.push(Addop.SUB);
	}

	public void visit(Mul mult) {
		mulopStack.push(Mulop.MUL);
	}

	public void visit(Div div) {
		mulopStack.push(Mulop.DIV);
	}

	public void visit(Mod mod) {
		mulopStack.push(Mulop.REM);
	}

	public void visit(AddopCho addOp) {
		Addop op = addopStack.pop();
		if (op == Addop.ADD) {
			Code.put(Code.add);
		} else if (op == Addop.SUB) {
			Code.put(Code.sub);
		} else {
			report_error("Desila se greska pri aritmetickoj operaciji add/sub", null);
		}
	}

	public void visit(MulopFactorCho mulOp) {
		Mulop op = mulopStack.pop();

		if (op == Mulop.MUL) {
			Code.put(Code.mul);
		} else if (op == Mulop.DIV) {
			Code.put(Code.div);
		} else if (op == Mulop.REM) {
			Code.put(Code.rem);
		} else {
			report_error("Desila se greska pri aritmetickoj operaciji mul/div/rem", null);
		}
	}
		
	public void visit(NewTypeArr newTypeArr) {
		Code.loadConst(2);
		Code.put(Code.mul);

		if (newTypeArr.getType().struct == Tab.charType) {
			Code.put(Code.newarray);
			Code.put(0);
		} else if (newTypeArr.getType().struct == Tab.intType || newTypeArr.getType().struct == SemanticPass.boolType) {
			Code.put(Code.newarray);
			Code.put(1);
		} else {
			report_error("Nizovi tipa " + newTypeArr.getType() + " nisu podrzani", null);
		}
	}

	public void visit(TermFact termF) {
		if (termF.getParent().getClass() == MinusExpression.class)
			Code.put(Code.neg);		
	}

	public void visit(LeftQuest leftQ) {
		
		Code.loadConst(0);
		
		Code.putFalseJump(Code.eq, 0);
		pomoc1 = Code.pc - 2;

	}

	public void visit(RightQuest rightQ) {

		Code.fixup(pomoc1);
	}
}
