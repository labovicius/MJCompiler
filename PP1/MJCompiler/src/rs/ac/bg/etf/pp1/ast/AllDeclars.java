// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class AllDeclars extends AllDeclarations {

    private AllDeclarations AllDeclarations;
    private Declaration Declaration;

    public AllDeclars (AllDeclarations AllDeclarations, Declaration Declaration) {
        this.AllDeclarations=AllDeclarations;
        if(AllDeclarations!=null) AllDeclarations.setParent(this);
        this.Declaration=Declaration;
        if(Declaration!=null) Declaration.setParent(this);
    }

    public AllDeclarations getAllDeclarations() {
        return AllDeclarations;
    }

    public void setAllDeclarations(AllDeclarations AllDeclarations) {
        this.AllDeclarations=AllDeclarations;
    }

    public Declaration getDeclaration() {
        return Declaration;
    }

    public void setDeclaration(Declaration Declaration) {
        this.Declaration=Declaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(AllDeclarations!=null) AllDeclarations.accept(visitor);
        if(Declaration!=null) Declaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(AllDeclarations!=null) AllDeclarations.traverseTopDown(visitor);
        if(Declaration!=null) Declaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(AllDeclarations!=null) AllDeclarations.traverseBottomUp(visitor);
        if(Declaration!=null) Declaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AllDeclars(\n");

        if(AllDeclarations!=null)
            buffer.append(AllDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Declaration!=null)
            buffer.append(Declaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AllDeclars]");
        return buffer.toString();
    }
}
