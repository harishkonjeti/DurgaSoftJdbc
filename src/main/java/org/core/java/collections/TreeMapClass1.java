package org.core.java.collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapClass1 {
    public static void main(String[] args) {
        TreeMap<String,Integer> ts = new TreeMap<>();
        ts.put("banana",1);
        ts.put("apple",2);
        ts.put("orange",3);
        ts.put("carrot",4);
        System.out.println(ts);
    }
}
