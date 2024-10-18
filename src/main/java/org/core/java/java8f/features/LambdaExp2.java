package org.core.java.java8f.features;
interface Interface2{
    public void evenOrOdd(int val);
}
public class LambdaExp2 {
    public static void main(String[] args) {
        Interface2 interface2 = val -> {
            String str = val%2 == 0 ? "even" : "odd";
            System.out.println(val + " is a " + str + " number");
        };
        interface2.evenOrOdd(2);
        interface2.evenOrOdd(3);
    }
}
