package org.core.java.doubts;

class B{
    static {
        System.out.println("B class static block");
    }
    B(){
        System.out.println("B class constructor");
    }
    public void m1(){
        System.out.println("method m1");
    }
}

class C {
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
    static B b = new B();

    public static void main(String[] args) {
        System.out.println("In main method");
        C c = new C();
        c.m2();
    }
}
