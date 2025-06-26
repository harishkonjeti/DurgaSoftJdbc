package org.core.java.java8f.generics;

import java.util.ArrayList;
import java.util.List;

public class Udemy2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);

        List strList = list;
        strList.add("abc");
        System.out.println(strList);
        System.out.println(list);

        addIncorrectData(list);
        System.out.println(list);

        //Inheritance in generics
        List<String> strList1 = new ArrayList<>();
        strList1.add("abc");
        strList1.add("def");

        printList(strList1);
        printList(list);

//        addToList(strList1);

    }

    private static void addIncorrectData(List list) {
        //type erasure
        //allows type erasure for backward compatibility
        //types will be removed at runtime
        //for arrays it is not possible
        list.add("edf");
    }

    private static void addIncorrectStringData(Object[] intArray) {
//        arrays won't allow type erasure
        intArray[0] = "abc";
    }

    private static void addToList(List<Object> names) {
        //Object subclasses cannot call this method as polymorphism is not supported in generics
    }
    private static <T> void printList(List<T> list) {
        //List<T> this T is from obj instance but static methods don't associate
        //with instances, so T type must be present before return type
        System.out.println(list);
    }
}
