package org.core.java.collections;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
class Address implements Comparable<Address> {
    private String name;
    private String street;
    private String city;

    public Address(String name, String street, String city) {
        this.name = name;
        this.street = street;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Address o) {
        return this.getCity().compareToIgnoreCase(o.getCity());
    }

    // other getters and setters omitted for brevity
}

class Person1 {
    private String name;
    private List<Address> addresses;

    public Person1(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    // other getters and setters omitted for brevity
}

public class ComparatorTest {
    public static void main(String[] args) {
        // Sample data
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("John", "123 Elm St", "New York"));
        addresses.add(new Address(null,  "456 Oak St", "Los Angeles"));
        addresses.add(new Address(null,  "675 Oak St", "NYC"));
        addresses.add(new Address("bob", "789 Pine St", "Chicago"));
        addresses.add(new Address("james", "147 yellow St", "San Francisco"));

        Person1 person1 = new Person1("Mike", addresses);

        Collections.sort(person1.getAddresses());
        person1.getAddresses().forEach(addr ->
                System.out.println(addr.getName() + ", " + addr.getStreet() + ", " + addr.getCity()));

        System.out.println("--------------------");
        // Sorting addresses by name
        person1.getAddresses().sort(Comparator.comparing(e->{
            if (e.getName() != null) {
                return e.getName().trim();
            } else {
                return null;
            }
        }, Comparator.nullsLast(String::compareToIgnoreCase)));

        // Display sorted addresses
        person1.getAddresses().forEach(addr ->
                System.out.println(addr.getName() + ", " + addr.getStreet() + ", " + addr.getCity()));

//        person1.getAddresses().sort(Comparator.nullsLast(String::compareToIgnoreCase));

        System.out.println("--------------------");
        List<String> sList = List.of("Harry", "mike", "bob", "Chinna");
        List<String> strList = new ArrayList<>(sList);
        Collections.sort(strList);
        System.out.println(strList);
        System.out.println("-----------------------");
        List<Integer> iList = List.of(2, 5, 3, 1, 5, 9, 5, 7);
        List<Integer> integerList = new ArrayList<>(iList);
        Collections.sort(integerList);
        System.out.println(integerList);
    }
}
