package org.core.java.generics;

public class Zoo {
    public static void main(String[] args) {
        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal1(new Lion());
        lionCage.setAnimal2(new Lion());

//        Cage<Monkey> monkeyCage = new Cage<>(new Monkey(), new Lion());
        Cage<Monkey> monkeyCage = new Cage<Monkey>(new Monkey(), new Monkey());
    }
}
