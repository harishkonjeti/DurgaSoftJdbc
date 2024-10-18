package org.core.java.java8f.features;

import java.util.TreeSet;

public class LambdaExp4 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((str1,str2)->str1.length()-str2.length());
        ts.add("AAA");
        ts.add("B");
        ts.add("CCCC");
        ts.add("EE");
        ts.add("DDDDD");
        System.out.println(ts);
    }
}
