package org.core.java.oops;
class A{
    int z = staticMethod();
    static {
        System.out.println("A Class Loading....");
    }
    A(){
        System.out.println("A Class Object Creating.....");
    }
    static int i = 10;
    int j = 20;

    public static int staticMethod(){
        i = i + 5;
        System.out.println("i : " + i);
        return i;
    }
    public  void instanceMethod(){
        this.i = this.i + 10;
        System.out.println("i : " + i + " j : " + j);
    }
}


public class C6_StaticBlock {
    static {
        System.out.println("C6_StaticBlock Class Loading");
    }
    C6_StaticBlock(){
        System.out.println("C6_StaticBlock object creating");
    }
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //by creating object
        A a = new A();
        //without creating object
        //loads A class byte code to memory without creating object
        Class c = Class.forName("org.core.java.oops.A");
        Object o = c.newInstance();
        A a1 = (A) o;

        a.instanceMethod();

        A a2 = null;
        System.out.println("a1.i : " +a2.i);
        a1.staticMethod();
    }
}
