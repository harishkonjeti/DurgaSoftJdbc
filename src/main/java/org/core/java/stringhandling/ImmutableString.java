package org.core.java.stringhandling;

public class ImmutableString {
    public static void main(String[] args) {
        String str ="HarryPotter";
        System.out.println(str);
        System.out.println(str.hashCode());
        str = str.substring(2,8);
        System.out.println(str);
        System.out.println(str.hashCode());
    }
}
