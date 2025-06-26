package org.core.java.oops;

class AA {
    public void m1() {
        System.out.println("A");
    }

    public static void m2() {
        System.out.println("Static A");
    }
}

class AB extends AA {
    @Override
    public void m1() {
        System.out.println("B");
    }

//    @Override
    public static void m2() {
        System.out.println("Static B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        AA a = new AB();
        a.m1();
        a.m2();
    }
}
