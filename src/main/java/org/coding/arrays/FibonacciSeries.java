package org.coding.arrays;
//0,1,1,2,3,5,8,13...
public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(firstNum);
            int temp = firstNum+secondNum;
            firstNum = secondNum;
            secondNum = temp;
        }
    }
}
