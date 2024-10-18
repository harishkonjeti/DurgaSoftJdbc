package org.core.java.collections;

import java.util.TreeSet;

class Employee{
}
class Customer implements Comparable{
    @Override
    public String toString() {
        return "Customer";
    }

    @Override
    public int compareTo(Object o) {
        return 100;
    }
}
public class TreeSetClass1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("DDD");
        ts.add("AAA");
        ts.add("EEE");
        ts.add("BBB");
        ts.add("FFF");
        ts.add("CCC");
        System.out.println(ts);
        ts.add("BBB");
        ts.add("CCC");
        System.out.println(ts);
        //ts.add(null); ---> NullPointerException
        //ts.add(100); ----> ClassCastException
        TreeSet ts1 = new TreeSet();
        //ts1.add(new Employee()); ---> ClassCastException
        ts1.add(new Customer());
        System.out.println(ts1);
    }
}
