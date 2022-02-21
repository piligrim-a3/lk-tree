package ru.bgpu.lk.tree;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        LkTree<Integer> tree = new LkTree<>();
        Random random = new Random();
        for(int i=0; i<5; i++) {
            int value = random.nextInt(100);
            System.out.println(value);
            tree.add(value);
        }
        System.out.println(tree);
        tree.leftVisit(System.out::println);
        System.out.println("height: "+tree.height());
    }
}
