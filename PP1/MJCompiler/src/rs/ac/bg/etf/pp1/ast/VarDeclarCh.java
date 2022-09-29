// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class VarDeclarCh extends VarDeclarationCh {

    private VarDeclarationCh VarDeclarationCh;
    private VarDeclaration VarDeclaration;

    public VarDeclarCh (VarDeclarationCh VarDeclarationCh, VarDeclaration VarDeclaration) {
        this.VarDeclarationCh=VarDeclarationCh;
        if(VarDeclarationCh!=null) VarDeclarationCh.setParent(this);
        this.VarDeclaration=VarDeclaration;
        if(VarDeclaration!=null) VarDeclaration.setParent(this);
    }

    public VarDeclarationCh getVarDeclarationCh() {
        return VarDeclarationCh;
    }

    public void setVarDeclarationCh(VarDeclarationCh VarDeclarationCh) {
        this.VarDeclarationCh=VarDeclarationCh;
    }

    public VarDeclaration getVarDeclaration() {
        return VarDeclaration;
    }

    public void setVarDeclaration(VarDeclaration VarDeclaration) {
        this.VarDeclaration=VarDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclarationCh!=null) VarDeclarationCh.accept(visitor);
        if(VarDeclaration!=null) VarDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclarationCh!=null) VarDeclarationCh.traverseTopDown(visitor);
        if(VarDeclaration!=null) VarDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclarationCh!=null) VarDeclarationCh.traverseBottomUp(visitor);
        if(VarDeclaration!=null) VarDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclarCh(\n");

        if(VarDeclarationCh!=null)
            buffer.append(VarDeclarationCh.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclaration!=null)
            buffer.append(VarDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclarCh]");
        return buffer.toString();
    }
}
