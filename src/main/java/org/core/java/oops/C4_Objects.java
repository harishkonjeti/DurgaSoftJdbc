package org.core.java.oops;

import java.util.List;

public class C4_Objects {
    public static void main(String[] args) {
        C4_Objects obj = new C4_Objects();
        //integer value
        System.out.println("hash code of object : " + obj.hashCode());
        //hexa decimal of hashcode
        System.out.println("obj : " + obj);
        System.out.println("obj to String method: " + obj.toString());

        // to string method for different objects
        String str = new String("abc");
        System.out.println(str);
        Exception e = new Exception();
        System.out.println(e);
        Thread t = new Thread();
        System.out.println(t);
        List list = List.of(10,20,30,40,50);
        System.out.println(list);

    }
}
