package org.core.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraylistClass {

    public static void main(String[] args) {
        //public java.util.ArrayList(java.util.Collection<? extends E>);
        Set setData = new HashSet();
        setData.add("ab");
        setData.add("cd");
        setData.add("ef");
        System.out.println(setData);
        List arrayListData = new ArrayList(setData);
        System.out.println(arrayListData);

        arrayListData.add(1);
        arrayListData.add(true);
        arrayListData.add(1.34f);
        arrayListData.add('C');
        System.out.println(arrayListData);
        arrayListData.set(4,false);
        arrayListData.get(5);
        arrayListData.remove(6);
        System.out.println(arrayListData);

        Person person1 = new Person("1","harry","23");
        Person person2 = new Person("2","potter","24");
        Person person3 = new Person();
        Person person4 = new Person();
        person3.setId("3");
        person3.setName("series");
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        System.out.println(personList);

    }
}
