package org.core.java.doubts;

public class Test {
    public static void main(String[] args) {
        Double d1 = 10.0/0.0;
        System.out.println(d1.isInfinite());
        System.out.println(d1.isNaN());
    }
}
