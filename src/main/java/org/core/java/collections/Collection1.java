package org.core.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;


public class Collection1 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.get(1));
        list1.add(3,4);
        list1.add(4,5);
        System.out.println(list1.toString());
        List list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        List list3 = new ArrayList();
        list3.add(1);
        list3.add(2);
        list3.add(2);
        list1.addAll(5,list2);
        System.out.println(list1);
        System.out.println(list1.contains(3));
        System.out.println(list3.equals(list2));
        System.out.println(list2.hashCode());
        System.out.println(list3.hashCode());
        System.out.println(list1.remove(2));
        System.out.println(list1);

        List<Person> personList = new ArrayList();
        Person person1 = new Person("1","pavan","25");
        Person person2 = new Person("2","ntr","22");
        Person person3 = new Person("3","mahesh","23");
        Person person4 = new Person("4","mahesh","23");
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
//        personList.add(0,person4);
//        personList.add(person4);
//        personList.remove(2);
//        personList.remove(person2);
//        personList.add(4,person4);
//        personList.clear();
        System.out.println(personList.contains(person4));
        for(Person person:personList){
            System.out.println(person);
        }
//        System.out.println(personList.get(1));
        System.out.println(personList.size());
        System.out.println(personList.isEmpty());
        personList.isEmpty();
        System.out.println(personList.indexOf(person1));
        System.out.println(personList.lastIndexOf(person1));
//        personList.sort((Comparator<? super Person>) person1);
        System.out.println(personList.getClass());
        System.out.println(person1.getClass());

    }
}
