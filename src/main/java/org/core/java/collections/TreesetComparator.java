package org.core.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Person person1 = (Person) o1;
        Person person2 = (Person) o2;
        //for strings we will use compareTo method and for int types we can use val1-val2
        int val = person1.getAge().compareTo(person2.getAge());
        if(val == 0 ){
            int nameCompare = person1.getName().compareTo(person2.getName());
            if(nameCompare == 0){
                int idCompare = person1.getId().compareTo(person2.getId());
                return idCompare;
            }
            return nameCompare;
        }
        return val;
    }
}

public class TreesetComparator {
    public static void main(String[] args) {
        Person person1 = new Person("1","harry","23");
        Person person2 = new Person("2","potter","18");
        Person person3 = new Person("3","wave","20");
        Person person4 = new Person("4","rock","18");
        Person person5 = new Person("5","rock","18");
        TreeSet ts = new TreeSet<>(new MyComparator());
        ts.add(person1);
        ts.add(person2);
        ts.add(person3);
        ts.add(person4);
        ts.add(person5);
        System.out.println(ts);
    }
}
