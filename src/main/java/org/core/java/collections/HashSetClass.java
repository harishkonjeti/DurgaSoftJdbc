package org.core.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetClass {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(null);
        arrayList.add(null);
        System.out.println(arrayList);
        Set hashset = new HashSet(arrayList);
        System.out.println(hashset);
//        TreeSet treeSet = new TreeSet(arrayList);   --> error due to null
//        System.out.println(treeSet);
    }
}
