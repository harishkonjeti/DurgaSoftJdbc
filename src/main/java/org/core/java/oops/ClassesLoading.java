package org.core.java.oops;

class B1 {
    static {
        System.out.println("B class static block");
    }
    B1(){
        System.out.println("B class constructor");
    }
    public void m1(){
        System.out.println("method m1");
    }
}

class C1 {
    public void m2(){
        ClassesLoading.b.m1();
    }
}
public class ClassesLoading {
    static {
        System.out.println("main class static block");
    }
    ClassesLoading(){
        System.out.println("In main class");
    }
    static B1 b = new B1();

    public static void main(String[] args) {
        System.out.println("In main method");
        C1 c = new C1();
        c.m2();
    }
}
