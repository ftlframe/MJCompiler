// generated with ast extension for cup
// version 0.8
// 19/7/2024 21:39:14


package rs.ac.bg.etf.pp1.ast;

public class ErrorSemi extends Decl {

    public ErrorSemi () {
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
        buffer.append("ErrorSemi(\n");

        buffer.append(tab);
        buffer.append(") [ErrorSemi]");
        return buffer.toString();
    }
}
