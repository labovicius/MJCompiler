// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class DQTerm extends Expr {

    private LeftQ LeftQ;
    private RightQ RightQ;

    public DQTerm (LeftQ LeftQ, RightQ RightQ) {
        this.LeftQ=LeftQ;
        if(LeftQ!=null) LeftQ.setParent(this);
        this.RightQ=RightQ;
        if(RightQ!=null) RightQ.setParent(this);
    }

    public LeftQ getLeftQ() {
        return LeftQ;
    }

    public void setLeftQ(LeftQ LeftQ) {
        this.LeftQ=LeftQ;
    }

    public RightQ getRightQ() {
        return RightQ;
    }

    public void setRightQ(RightQ RightQ) {
        this.RightQ=RightQ;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(LeftQ!=null) LeftQ.accept(visitor);
        if(RightQ!=null) RightQ.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(LeftQ!=null) LeftQ.traverseTopDown(visitor);
        if(RightQ!=null) RightQ.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(LeftQ!=null) LeftQ.traverseBottomUp(visitor);
        if(RightQ!=null) RightQ.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DQTerm(\n");

        if(LeftQ!=null)
            buffer.append(LeftQ.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(RightQ!=null)
            buffer.append(RightQ.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DQTerm]");
        return buffer.toString();
    }
}
