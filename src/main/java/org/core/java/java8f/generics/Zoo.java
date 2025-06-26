package org.core.java.java8f.generics;

public class Zoo {
    public static void main(String[] args) {
        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal1(new Lion());
        lionCage.setAnimal2(new Lion());

        //for constructor we have use type parameter along with constructor
        Cage<Monkey> monkeyCage1 = new Cage(new Monkey(), new Lion());
//        Cage<Monkey> monkeyCage2 = new Cage<>(new Monkey(), new Lion());

        Lion lion = new Lion();
        lion.sleep();
        lion.eat();
        lion.run();

    }
}
