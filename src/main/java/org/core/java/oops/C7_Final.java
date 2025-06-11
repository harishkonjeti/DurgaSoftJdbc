package org.core.java.oops;

class C7 {
    final int i;

//    final String j;
    public C7(int i) {
        this.i = i;
    }

    void m1() {
        System.out.println("i:" + i);

        //cannot initialize final variables in local methods
//        j = "hello";
    }
}

public class C7_Final {

    public static void main(String[] args) {
        C7 obj = new C7(10);
        obj.m1();
    }
}
