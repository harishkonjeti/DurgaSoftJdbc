package org.core.java.oops;

import java.util.ArrayList;
import java.util.List;

public class CallByList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        changeList(list);
        System.out.println("after change method " + list);

        List<Integer> list1 = list;
        list1.add(5);
        System.out.println("list1 " + list1);
        System.out.println("list " + list);
    }

    private static void changeList(List<Integer> list) {
        list.remove(2);
    }
}
