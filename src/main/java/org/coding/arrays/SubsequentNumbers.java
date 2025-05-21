package org.coding.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SubsequentNumbers {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 0) {
                System.out.println(intArray[i]);
            }
        }

        IntStream.of(intArray).filter(i -> i%2 == 0).forEach(System.out::println);
        Arrays.stream(intArray).filter(i -> i%2 == 0).forEach(System.out::println);

        IntStream.range(0, intArray.length).filter(i -> i%2 == 0).map(i -> intArray[i]).forEach(System.out::println);
    }
}
