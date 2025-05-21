package org.coding.strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class WordCount {
    public static void main(String[] args) {
        String str = "I am learning Java";
        String[] strVal = str.split("\s");
        for (String s : strVal) {
            System.out.println(s);
        }
        System.out.println(strVal.length);

        long count = Arrays.stream(str.split("\s")).count();
        System.out.println(count);

        System.out.println("--------------");
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(intArray.length);
        for (int i : intArray) {
            System.out.println(i);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        Arrays.stream(intArray).forEach(e -> System.out.println("stream: " + e));
        Arrays.stream(intArray).forEach(System.out::println);
        Stream.of(intArray).forEach(e -> System.out.println(e));
        System.out.println(intArray.toString());
    }
}
