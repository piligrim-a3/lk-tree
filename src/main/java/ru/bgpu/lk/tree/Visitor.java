package ru.bgpu.lk.tree;

public interface Visitor<T> {
    void visit(T value);
}
