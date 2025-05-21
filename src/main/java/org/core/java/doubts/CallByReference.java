package org.core.java.doubts;

public class CallByReference {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        System.out.println("Before method call: " + person1.getName());
        changeName(person1);
        System.out.println("After method call: " + person1.getName());
        Person person2 = person1;
        person2.setName("Kohli");
        System.out.println("After setting person1: " + person1.getName());
        System.out.println("After setting person2: " + person2.getName());
    }

    public static void changeName(Person person1) {
        person1.setName("Jane");
        System.out.println("Inside method: " + person1.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
