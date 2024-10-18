package org.core.java.examples;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int val = sc.nextInt();
        if(val%2 == 0){
            System.out.println(val + " is a even number");
        }
        else{
            System.out.println(val + " is a odd number");
        }
    }
}
