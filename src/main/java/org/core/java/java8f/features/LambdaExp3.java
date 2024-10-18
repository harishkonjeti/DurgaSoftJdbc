package org.core.java.java8f.features;

interface Math{
    int sum(int a, int b);
}
public class LambdaExp3 {
    public static void main(String[] args) {
        Math math = (a,b) -> a+b;
        System.out.println(math.sum(1,2));
        System.out.println(math.sum(21,32));
    }
}
