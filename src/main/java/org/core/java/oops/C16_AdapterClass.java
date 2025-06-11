package org.core.java.oops;
interface Manymethods{
    void m1();
    void m2();
    void m3();
    void m4();

}

abstract class AdapterClass implements Manymethods{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
}

class ImplementationClass1 extends AdapterClass{
    @Override
    public void m1() {
//        super.m1();
        System.out.println("Implementation class method");
    }
}
public class C16_AdapterClass {
    public static void main(String[] args) {
    Manymethods obj = new ImplementationClass1();
    obj.m1();
    }
}
