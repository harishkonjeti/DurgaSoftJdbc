package org.corejava.oops;
class A{
    static {
        System.out.println("Class Loading....");
    }
    A(){
        System.out.println("Object Creating.....");
    }
    static int i = 10;
    int j = 20;

    public static void staticMethod(){
        i = i + 5;
        System.out.println("i : " + i);
    }
    public  void instanceMethod(){
        this.i = this.i + 10;
        System.out.println("i : " + i + " j : " + j);
    }
}


public class C6_StaticBlock {
    static {
        System.out.println("Class Loading");
    }
    C6_StaticBlock(){
        System.out.println("object creating");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //by creating object
        A a = new A();
        //without creating object
        Class c = Class.forName("org.corejava.oops.A");
        a.instanceMethod();

        A a1 = null;
        System.out.println("a1.i : " +a1.i);
        a1.staticMethod();
    }
}
