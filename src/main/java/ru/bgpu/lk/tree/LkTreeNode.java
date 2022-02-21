package ru.bgpu.lk.tree;

public class LkTreeNode <T extends Comparable> {

    private T value;

    private LkTreeNode left;
    private LkTreeNode right;

    public LkTreeNode(T value) {
        this.value = value;
    }

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

    @Override
    public String toString() {
        return "["+value+" l: "+left+" r: "+right+"]";
    }
}
