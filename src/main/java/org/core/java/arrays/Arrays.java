package org.core.java.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        int[] intArray1 = new int[5];
        intArray1[0] = 2;
        intArray1[1] = 4;
        intArray1[2] = 6;
        System.out.println(intArray);
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
        System.out.println();
        for (int val:intArray1) {
            System.out.println(val);
        }

        int[][] twoDimArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(twoDimArray[0][2]);
        System.out.println(twoDimArray[1].length);
    }
}
