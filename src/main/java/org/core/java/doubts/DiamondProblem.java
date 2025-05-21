package org.core.java.doubts;

import java.util.SortedSet;
import java.util.TreeSet;

interface Math{
    void m1();
    default int m2() {
        return 9;
    }
}

interface Calcus {
    void m1();
    default int m2() {
        return 10;
    }
}
public class DiamondProblem implements Math,Calcus {
    public static void main(String[] args) {
        DiamondProblem dp = new DiamondProblem();
        dp.m1();
        System.out.println(dp.m2());
        SortedSet<String> ss = new TreeSet<>();
    }

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public int m2() {
        return Math.super.m2();
    }
}
