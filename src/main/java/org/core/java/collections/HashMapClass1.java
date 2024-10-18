package org.core.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("A",1);
        hashMap.put("B",2);
        hashMap.put("C",3);
        hashMap.put("D",4);
        System.out.println(hashMap);
        Set<Map.Entry<String,Integer>> entries = hashMap.entrySet();
        for (Map.Entry entry: entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
