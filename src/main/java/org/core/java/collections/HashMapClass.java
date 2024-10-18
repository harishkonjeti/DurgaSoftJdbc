package org.core.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();
        hashMap.put("A",1);
        hashMap.put("B",2);
        hashMap.put("C",3);
        System.out.println(hashMap);
        HashMap hashmap1 = new HashMap<>();
        hashmap1.put("D",4);
        hashmap1.putAll(hashMap);
        System.out.println(hashmap1);
        System.out.println(hashMap.get("B"));
        System.out.println(hashMap.get("X"));
        System.out.println(hashmap1.remove("C"));
        System.out.println(hashmap1.remove("Y"));
        System.out.println(hashMap.containsKey("B"));
        System.out.println(hashMap.containsKey("X"));
        System.out.println(hashMap.containsValue(2));
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
        hashmap1.clear();
        System.out.println(hashmap1);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
    }
}
