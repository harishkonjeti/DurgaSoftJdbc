package org.coding.strings;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listene";
        String str2 = "silente";

        //method 1
        System.out.println("Strings are anagram : " + isAnagram(str1, str2));

        //method 2
        System.out.println("Strings are anagram method 2 : " + isAnagram2(str1, str2));

        //method 3
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagram as their length is not same.");
            return;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        for (int i = 0; i < charArray1.length; i++) {
            int index = str2.indexOf(charArray1[i]);
            if (index == -1) {
                System.out.println("Strings are not anagram as their length is same but not anagram.");
                return;
            }
            charArray2[index] = ' ';
        }

        for (int i = 0; i < charArray2.length; i++) {
            if (charArray2[i] != ' ') {
                System.out.println("Strings are not anagram as their length is same but not anagram.");
                return;
            }
        }

        System.out.println("Strings are anagram.");

    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String sortedStr1 = str1.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        String sortedStr2 = str2.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        return sortedStr1.equals(sortedStr2);
    }

    public static boolean isAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>(); // <char, count>
        for (char c: charArray1) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>(); // <char, count>
        for (char c: charArray2) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        System.out.println("map1 : " + map1);
        System.out.println("map2 : " + map2);
        return map1.equals(map2);
    }
}
