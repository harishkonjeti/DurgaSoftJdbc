package org.core.java.collections;

import java.util.Objects;
import java.util.Optional;

public class OptionalClass1 {
    public static void main(String[] args) {
        Optional<String> obj1 = Optional.empty();
        Optional<String> obj2 = Optional.of("Harry");
        Optional<String> obj3 = Optional.ofNullable("Potter");
        Optional<String> obj4 = Optional.of(" ");
        Optional<String> obj5 = Optional.ofNullable(" ");
//        Optional<String> obj6 = Optional.of(null);  --> requires non null value
        Optional<String> obj7 = Optional.ofNullable(null);

        System.out.println("obj1 : " + obj1);
        System.out.println("obj2 : " + obj2);
        System.out.println("obj3 : " + obj3);
        System.out.println("obj4 : " + obj4);
        System.out.println("obj5 : " + obj5);
//        System.out.println("obj6 : " + obj6);
        System.out.println("obj7 : " + obj7 + "\n");

        //Get
//        System.out.println(obj1.get());
        System.out.println(obj2.get());
        System.out.println(obj3.get());
        System.out.println(obj4.get());
        System.out.println(obj5.get());
//        System.out.println(obj7.get());

        //isPresent
        System.out.println(obj1.isPresent());
        System.out.println(obj2.isPresent());

        //isEmpty
        System.out.println(obj1.isEmpty());
        System.out.println(obj2.isEmpty());

        obj1.ifPresent(s -> System.out.println(s.toUpperCase()));
        obj2.ifPresent(s -> System.out.println(s.toUpperCase()));

        obj1.ifPresentOrElse(s -> System.out.println(s.toUpperCase()), () -> System.out.println(obj1.isEmpty()));
        obj2.ifPresentOrElse(s -> System.out.println(s.toUpperCase()), () -> System.out.println(obj1.isEmpty()));

        System.out.println(obj2.filter(Objects::nonNull));
        System.out.println(obj1.filter(Objects::nonNull));

        System.out.println(obj1.orElse("Default String"));
        System.out.println(obj2.orElse("Default String"));

        System.out.println(obj1.orElseGet(() -> new String("orElseGet")));
        System.out.println(obj2.orElseGet(() -> new String("orElseGet")));

        System.out.println(obj2.orElseThrow());
//        System.out.println(obj1.orElseThrow());
    }
}
