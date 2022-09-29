// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class NoOptionArgs extends OptArgs {

    public NoOptionArgs () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NoOptionArgs(\n");

        buffer.append(tab);
        buffer.append(") [NoOptionArgs]");
        return buffer.toString();
    }
}