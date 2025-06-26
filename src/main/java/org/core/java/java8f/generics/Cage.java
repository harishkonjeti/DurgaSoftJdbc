package org.core.java.java8f.generics;

public class Cage<T extends Animal & Interface1 & Interface2> {
    private T animal1;
    private T animal2;

    public Cage() {

    }

    public Cage(T animal1, T animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public T getAnimal1() {
        return animal1;
    }

    public void setAnimal1(T animal1) {
        this.animal1 = animal1;
    }

    public T getAnimal2() {
        return animal2;
    }

    public void setAnimal2(T animal2) {
        this.animal2 = animal2;
    }
}
