package org.coding.strings;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String str1 = "Harry potter";
        String sb = new StringBuilder(str1).reverse().toString();
        System.out.println(sb);

        String str2 = IntStream.rangeClosed(1, str1.length())
                .mapToObj(i -> str1.substring(i - 1, i))
                .reduce("", (a, b) -> b + a)
                .toString();
        System.out.println(str2);

//        String str5 = IntStream.rangeClosed(1, str1.length())
//                .mapToObj(i -> str1.charAt(str1.length()-i))
//                .reduce(' ', (a, b) -> (char) (b + a))
//                .toString();
//        System.out.println(str5);

        String str3 = IntStream.rangeClosed(1, str1.length())
                .mapToObj(i -> str1.charAt(str1.length()-i))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(str3);

        String str4 = IntStream.rangeClosed(1, str1.length())
                .mapToObj(i -> str1.substring(i - 1, i))
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return String.join("", list);
                }));
        System.out.println(str4);
    }
}
