package org.core.java.oops;

class E{

}
class F extends E{

}
public class C21_InstanceOf {
    public static void main(String[] args) {
        E e = new E();
        F f = new F();
        E ef = new F();
        System.out.println(e instanceof E); //true
        System.out.println(e instanceof F); //false - superclass
        System.out.println(f instanceof E); //true - subclass
        System.out.println(f instanceof F); //true
        System.out.println(ef instanceof E);
        System.out.println(ef instanceof F);
    }
}
