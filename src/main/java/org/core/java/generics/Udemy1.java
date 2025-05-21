package org.core.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Udemy1 {
    public static void main(String[] args) {
        //generic problems
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list);

        Object obj = list.get(0);
        System.out.println(obj);

        //casting
        int i = (int)list.get(0);
        System.out.println(i);

        //autoboxing
        List<Integer> list1 = List.of(1,2,3,4,5);

        //unboxing
        int i1 = list1.get(0);
    }
}
