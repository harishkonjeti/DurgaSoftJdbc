package org.core.java.doubts;

public class CallByValue {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before method call: " + x);
        changeValue(x);
        System.out.println("After method call: " + x);
        int y = x;
        y = 30;
        System.out.println("After reassignment X: " + x);
        System.out.println("After reassignment Y: " + y);
    }

    public static void changeValue(int x) {
        x = 20;
        System.out.println("Inside method: " + x);
    }
}
