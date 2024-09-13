// generated with ast extension for cup
// version 0.8
// 12/8/2024 13:15:41


package rs.ac.bg.etf.pp1.ast;

public class BracketsMatrix extends Brackets {

    public BracketsMatrix () {
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
        buffer.append("BracketsMatrix(\n");

        buffer.append(tab);
        buffer.append(") [BracketsMatrix]");
        return buffer.toString();
    }
}
