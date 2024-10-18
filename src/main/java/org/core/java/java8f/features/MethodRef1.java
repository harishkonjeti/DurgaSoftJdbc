package org.core.java.java8f.features;

import java.awt.event.WindowListener;

@FunctionalInterface
interface Welcome{
    void sayHi();
}

class A {
    public A(){
        System.out.println("A class constructor");
    }
    public void randomMethod(){
        System.out.println("A class instance method");
    }

    public static void randomStaticMethod(){
        System.out.println("A class static method");
    }
}


public class MethodRef1 {
    public static void main(String[] args) {
        A a = new A();
        Welcome welcome1 = a::randomMethod;
        welcome1.sayHi();
        Welcome welcome2 = A::randomStaticMethod;
        welcome2.sayHi();
        Welcome welcome3 = A::new;
        welcome3.sayHi();
        Welcome welcome4 = new A()::randomMethod;
        welcome4.sayHi();
    }
}
