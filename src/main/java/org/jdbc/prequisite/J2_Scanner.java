package org.jdbc.prequisite;

import java.util.Scanner;

public class J2_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data for nextLine method : ");
        //to read a line of data as a String from Scanner
        String nextLineData = sc.nextLine();

        System.out.println("Enter data for next method : ");
        //to read a single word from Scanner
        String nextData = sc.next();

        //read primitive data directly with scanner
        System.out.println("Enter int data : ");
        int intData = sc.nextInt();

        System.out.println("Enter float data : ");
        float floatData = sc.nextFloat();

        System.out.println("nextLine Data : " + nextLineData);
        System.out.println("next Data : " + nextData);
        System.out.println("int Data : " + intData);
        System.out.println("float Data : " + floatData);
    }
}
