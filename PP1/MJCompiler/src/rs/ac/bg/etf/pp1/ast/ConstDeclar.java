// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclar extends ConstDeclaration {

    private String nameConst;
    private ConstTypeDeclaration ConstTypeDeclaration;

    public ConstDeclar (String nameConst, ConstTypeDeclaration ConstTypeDeclaration) {
        this.nameConst=nameConst;
        this.ConstTypeDeclaration=ConstTypeDeclaration;
        if(ConstTypeDeclaration!=null) ConstTypeDeclaration.setParent(this);
    }

    public String getNameConst() {
        return nameConst;
    }

    public void setNameConst(String nameConst) {
        this.nameConst=nameConst;
    }

    public ConstTypeDeclaration getConstTypeDeclaration() {
        return ConstTypeDeclaration;
    }

    public void setConstTypeDeclaration(ConstTypeDeclaration ConstTypeDeclaration) {
        this.ConstTypeDeclaration=ConstTypeDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstTypeDeclaration!=null) ConstTypeDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstTypeDeclaration!=null) ConstTypeDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstTypeDeclaration!=null) ConstTypeDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclar(\n");

        buffer.append(" "+tab+nameConst);
        buffer.append("\n");

        if(ConstTypeDeclaration!=null)
            buffer.append(ConstTypeDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclar]");
        return buffer.toString();
    }
}
