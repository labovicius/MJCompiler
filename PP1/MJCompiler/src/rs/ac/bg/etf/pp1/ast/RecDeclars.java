// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class RecDeclars extends Declaration {

    private RecordDeclarations RecordDeclarations;

    public RecDeclars (RecordDeclarations RecordDeclarations) {
        this.RecordDeclarations=RecordDeclarations;
        if(RecordDeclarations!=null) RecordDeclarations.setParent(this);
    }

    public RecordDeclarations getRecordDeclarations() {
        return RecordDeclarations;
    }

    public void setRecordDeclarations(RecordDeclarations RecordDeclarations) {
        this.RecordDeclarations=RecordDeclarations;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(RecordDeclarations!=null) RecordDeclarations.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(RecordDeclarations!=null) RecordDeclarations.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(RecordDeclarations!=null) RecordDeclarations.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("RecDeclars(\n");

        if(RecordDeclarations!=null)
            buffer.append(RecordDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [RecDeclars]");
        return buffer.toString();
    }
}
