package org.core.java.java8f.lambdas;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaExp4 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(Comparator.comparingInt(String::length));
        ts.add("AAA");
        ts.add("B");
        ts.add("CCCC");
        ts.add("EE");
        ts.add("DDDDD");
        System.out.println(ts);
    }
}
