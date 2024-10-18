package org.core.java.doubts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("d");
        list.add("c");
        list.add("a");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
