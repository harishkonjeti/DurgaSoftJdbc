package org.core.java.examples;

import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (num != 0) {
            int val = num % 10;
            if(val == 2 || val == 3 || val == 5 || val == 7){
                primeSum += val;
            }
            else{
                nonPrimeSum += val;
            }
            num = num/10;
        }
        System.out.println("prime numbers sum : " + primeSum);
        System.out.println("non prime numbers sum : " + nonPrimeSum);
    }
}
