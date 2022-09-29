// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class NormalExpression extends Expr1 {

    private Term Term;
    private AddopCh AddopCh;

    public NormalExpression (Term Term, AddopCh AddopCh) {
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
        this.AddopCh=AddopCh;
        if(AddopCh!=null) AddopCh.setParent(this);
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
    }

    public AddopCh getAddopCh() {
        return AddopCh;
    }

    public void setAddopCh(AddopCh AddopCh) {
        this.AddopCh=AddopCh;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Term!=null) Term.accept(visitor);
        if(AddopCh!=null) AddopCh.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
        if(AddopCh!=null) AddopCh.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Term!=null) Term.traverseBottomUp(visitor);
        if(AddopCh!=null) AddopCh.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NormalExpression(\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AddopCh!=null)
            buffer.append(AddopCh.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NormalExpression]");
        return buffer.toString();
    }
}
