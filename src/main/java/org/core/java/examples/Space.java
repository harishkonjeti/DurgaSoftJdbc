package org.core.java.examples;

import java.util.Scanner;

public class Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("emter a number : ");
        int val = sc.nextInt();
        String result ="";
        while (val!=0){
            int num = val%10;
            result = num + " " + result;
            val = val/10;
        }
        System.out.println(result);
    }
}
