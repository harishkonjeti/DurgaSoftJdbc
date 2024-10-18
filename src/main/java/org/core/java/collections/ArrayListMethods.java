package org.core.java.collections;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("b");
        data.add("d");
        Set setData = new HashSet<>();
        setData.add("a");
        setData.add("e");
        System.out.println(data);
        System.out.println("size : " + data.size());
        System.out.println("isEmpty : " + data.isEmpty());
        System.out.println("contains : " + data.contains("a"));
        System.out.println("contains all : " + data.containsAll(setData));
        System.out.println("index of b : " + data.indexOf("b"));
        System.out.println("last index of b : " + data.lastIndexOf("b"));
        System.out.println("get a : " + data.get(0));
        System.out.println("set a : " + data.set(4,"e"));
//        System.out.println("set a : " + data.set(5,"g")); //error
        System.out.println(data.add("h"));
        data.add(6,"i");
        data.add("j");
        System.out.println("remove : " + data.remove(7));
        System.out.println("remove - b : " + data.remove("b"));
//        data.retainAll(setData);
        System.out.println(data);
        Iterator iterator = data.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ListIterator listIterator = data.listIterator(3);
       /* System.out.println("-----------------------");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            System.out.println(listIterator.nextIndex());
        }*/
        System.out.println("------------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
            System.out.println(listIterator.previousIndex());
        }
        System.out.println("--------");
        System.out.println(data);
        System.out.println(data.subList(0,2));
        data.add(List.of("c","b","e","g"));
        System.out.println(data);
        System.out.println(data.get(6));
        System.out.println(data.set(6,"f"));
        System.out.println(data);
    }
}
