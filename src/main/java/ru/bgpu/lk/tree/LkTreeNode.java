package ru.bgpu.lk.tree;

public class LkTreeNode <T> {

    private T value;

    private LkTreeNode left;
    private LkTreeNode right;


    public LkTreeNode getLeft() {
        return left;
    }

    public void setLeft(LkTreeNode left) {
        this.left = left;
    }

    public LkTreeNode getRight() {
        return right;
    }

    public void setRight(LkTreeNode right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
