package net.dzhai.dp.behavioral.visitor;

public abstract class Node {
    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}