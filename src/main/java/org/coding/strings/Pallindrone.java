package org.coding.strings;

import java.util.stream.IntStream;

public class Pallindrone {
    public static void main(String[] args) {
        String str = "malayalam";
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        String revStr = rev.toString();
        if (str.equals(revStr)) {
            System.out.println(str + " is a Pallindrone");
        } else {
            System.out.println(str + " is not a Pallindrone");
        }

        String reverseString = IntStream.rangeClosed(1, str.length())
                .mapToObj(i -> str.substring(i-1, i))
                .reduce("", (a, b) -> b + a)
                .toString();
        System.out.println(reverseString);
    }
}
