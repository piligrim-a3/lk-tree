package ru.bgpu.lk.tree;

public class LkTree<T extends Comparable> {

    private LkTreeNode<T> root;

    public void add(T value) {
        if(root != null) {
            add(root, value);
        } else {
            root = new LkTreeNode<>(value);
        }
    }

    private void add(LkTreeNode node, T value) {
        if(node.getValue().compareTo(value) < 0) {
            // to right
            if(node.getRight() != null) {
                add(node.getRight(),value);
            } else {
                node.setRight(new LkTreeNode(value));
            }
        } else {
            // to left
            if(node.getLeft() != null) {
                add(node.getLeft(), value);
            } else {
                node.setLeft(new LkTreeNode(value));
            }
        }
    }

    @Override
    public String toString() {
        return "tree: "+root;
    }
}
