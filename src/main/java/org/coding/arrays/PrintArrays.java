package org.coding.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintArrays {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3};
        String[] stringArray = {"a", "b", "c"};

        //method 1
        for (int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        //method 2
        for (String i : stringArray) {
            System.out.println(i);
        }

        //method 3
        System.out.println("---method 3---");
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));

        //method 4
        System.out.println("---method 4---");
        Arrays.asList(intArray).forEach(System.out::println);
        Arrays.asList(stringArray).forEach(System.out::println);

        //method 5
        System.out.println("---method 5---");
        Arrays.stream(intArray).forEach(System.out::println);
        Arrays.stream(stringArray).forEach(System.out::println);

        //method 6
        System.out.println("---method 6---");
        Stream.of(intArray).forEach(System.out::println);
        Stream.of(stringArray).forEach(System.out::println);

        //method 7
        System.out.println("---method 7---");
        //String str = Arrays.stream(intArray).collect(Collectors.joining(", "));
        String strCollect = Arrays.stream(stringArray).collect(Collectors.joining(", "));
        System.out.println(strCollect);

        List<Integer> integerList = List.of(1, 2, 3, 4);
        System.out.println(integerList);
    }
}
