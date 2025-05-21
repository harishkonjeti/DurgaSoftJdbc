package org.core.java.collections;

class A {
    public <T> void  show(T t) {
        System.out.println("val: " + t);
    }

    public <T> T getValue(T t) {
        return t;
    }
}
public class GenericClass1 {
    public static void main(String[] args) {
        A a = new A();
        a.show("show");
        System.out.println("get : " + a.getValue("getvalue"));
    }
}
