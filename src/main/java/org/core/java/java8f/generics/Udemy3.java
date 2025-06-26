package org.core.java.java8f.generics;

import java.util.List;

public class Udemy3 {
    public <T extends Number> void showDouble(T value) {
        System.out.println(value.doubleValue());
    }

    //The wildcard ? (e.g., ? extends Integer) can only be used in generic type declarations, not as a method parameter type directly
    //? represents an unknown type, and Java doesn't allow giving a name (value) to a wildcard — you can't say "? named value".

    /* public void readLowerBound(? extends Integer value) {
        System.out.println(value);
    }*/

    //extends use for reading elements from a collection
    public void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    //super use for adding/writing elements to a collection
    public void addNumbers(List<? super Integer> list) {
        list.add(10); // You can add Integer or its subclass
    }
}
