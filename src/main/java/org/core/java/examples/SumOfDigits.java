package org.core.java.examples;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("emter a number : ");
        int val = sc.nextInt();
        int sum = 0;
        while (val!=0){
            int num = val%10;
            sum += num;
            val = val/10;
        }
        System.out.println(sum);
    }
}
