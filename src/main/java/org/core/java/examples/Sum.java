package org.core.java.examples;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter val1 : ");
        int val1 = sc.nextInt();
        System.out.print("Enter val2 : ");
        int val2 = sc.nextInt();
        System.out.print("Enter val3 : ");
        int val3 = sc.nextInt();

        int result = val1+val2+val3;
        System.out.println(result);

    }
}
