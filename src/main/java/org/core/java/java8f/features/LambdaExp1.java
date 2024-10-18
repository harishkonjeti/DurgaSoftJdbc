package org.core.java.java8f.features;

@FunctionalInterface
interface Wish{
    public String sayWelcome(String str);
}
public class LambdaExp1 {
    public static void main(String[] args) {
        Wish wish = (val) -> {
            String strVal = "Hello, " + val + "!";
            return strVal;
        };
        System.out.println(wish.sayWelcome("Harish"));
    }
}
