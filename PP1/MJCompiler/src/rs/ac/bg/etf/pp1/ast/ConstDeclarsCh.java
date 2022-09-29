// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclarsCh extends ConstDeclarationCh {

    private ConstDeclarationCh ConstDeclarationCh;
    private ConstDeclaration ConstDeclaration;

    public ConstDeclarsCh (ConstDeclarationCh ConstDeclarationCh, ConstDeclaration ConstDeclaration) {
        this.ConstDeclarationCh=ConstDeclarationCh;
        if(ConstDeclarationCh!=null) ConstDeclarationCh.setParent(this);
        this.ConstDeclaration=ConstDeclaration;
        if(ConstDeclaration!=null) ConstDeclaration.setParent(this);
    }

    public ConstDeclarationCh getConstDeclarationCh() {
        return ConstDeclarationCh;
    }

    public void setConstDeclarationCh(ConstDeclarationCh ConstDeclarationCh) {
        this.ConstDeclarationCh=ConstDeclarationCh;
    }

    public ConstDeclaration getConstDeclaration() {
        return ConstDeclaration;
    }

    public void setConstDeclaration(ConstDeclaration ConstDeclaration) {
        this.ConstDeclaration=ConstDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstDeclarationCh!=null) ConstDeclarationCh.accept(visitor);
        if(ConstDeclaration!=null) ConstDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstDeclarationCh!=null) ConstDeclarationCh.traverseTopDown(visitor);
        if(ConstDeclaration!=null) ConstDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstDeclarationCh!=null) ConstDeclarationCh.traverseBottomUp(visitor);
        if(ConstDeclaration!=null) ConstDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclarsCh(\n");

        if(ConstDeclarationCh!=null)
            buffer.append(ConstDeclarationCh.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstDeclaration!=null)
            buffer.append(ConstDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclarsCh]");
        return buffer.toString();
    }
}
