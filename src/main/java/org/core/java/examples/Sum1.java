package org.core.java.examples;

import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while (num != 0) {
            int val = num % 10;
            if(val % 2 == 0){
                evenSum += val;
            }
            else {
                oddSum += val;
            }
            num = num/10;
        }
        System.out.println("even numbers sum : " + evenSum);
        System.out.println("odd numbers sum : " + oddSum);
    }
}
