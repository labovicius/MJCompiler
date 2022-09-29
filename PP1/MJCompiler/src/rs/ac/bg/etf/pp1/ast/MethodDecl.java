// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class MethodDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private MethodTypeName MethodTypeName;
    private MethodParams MethodParams;
    private MethodVarDeclaration MethodVarDeclaration;
    private StatementList StatementList;

    public MethodDecl (MethodTypeName MethodTypeName, MethodParams MethodParams, MethodVarDeclaration MethodVarDeclaration, StatementList StatementList) {
        this.MethodTypeName=MethodTypeName;
        if(MethodTypeName!=null) MethodTypeName.setParent(this);
        this.MethodParams=MethodParams;
        if(MethodParams!=null) MethodParams.setParent(this);
        this.MethodVarDeclaration=MethodVarDeclaration;
        if(MethodVarDeclaration!=null) MethodVarDeclaration.setParent(this);
        this.StatementList=StatementList;
        if(StatementList!=null) StatementList.setParent(this);
    }

    public MethodTypeName getMethodTypeName() {
        return MethodTypeName;
    }

    public void setMethodTypeName(MethodTypeName MethodTypeName) {
        this.MethodTypeName=MethodTypeName;
    }

    public MethodParams getMethodParams() {
        return MethodParams;
    }

    public void setMethodParams(MethodParams MethodParams) {
        this.MethodParams=MethodParams;
    }

    public MethodVarDeclaration getMethodVarDeclaration() {
        return MethodVarDeclaration;
    }

    public void setMethodVarDeclaration(MethodVarDeclaration MethodVarDeclaration) {
        this.MethodVarDeclaration=MethodVarDeclaration;
    }

    public StatementList getStatementList() {
        return StatementList;
    }

    public void setStatementList(StatementList StatementList) {
        this.StatementList=StatementList;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodTypeName!=null) MethodTypeName.accept(visitor);
        if(MethodParams!=null) MethodParams.accept(visitor);
        if(MethodVarDeclaration!=null) MethodVarDeclaration.accept(visitor);
        if(StatementList!=null) StatementList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodTypeName!=null) MethodTypeName.traverseTopDown(visitor);
        if(MethodParams!=null) MethodParams.traverseTopDown(visitor);
        if(MethodVarDeclaration!=null) MethodVarDeclaration.traverseTopDown(visitor);
        if(StatementList!=null) StatementList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodTypeName!=null) MethodTypeName.traverseBottomUp(visitor);
        if(MethodParams!=null) MethodParams.traverseBottomUp(visitor);
        if(MethodVarDeclaration!=null) MethodVarDeclaration.traverseBottomUp(visitor);
        if(StatementList!=null) StatementList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDecl(\n");

        if(MethodTypeName!=null)
            buffer.append(MethodTypeName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodParams!=null)
            buffer.append(MethodParams.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodVarDeclaration!=null)
            buffer.append(MethodVarDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementList!=null)
            buffer.append(StatementList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDecl]");
        return buffer.toString();
    }
}
