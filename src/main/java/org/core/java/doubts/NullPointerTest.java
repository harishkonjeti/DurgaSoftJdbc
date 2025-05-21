package org.core.java.doubts;

import java.util.ArrayList;
import java.util.List;

public class NullPointerTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        System.out.println(list1);
//        List<String> list2 = new ArrayList<>(null);
//        System.out.println(list1);
    }
}
