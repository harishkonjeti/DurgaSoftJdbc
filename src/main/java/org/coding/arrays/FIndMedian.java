package org.coding.arrays;

import java.util.Arrays;

/*
Sort the Array
If the number of elements 𝑛
n is odd, the median is the middle element
n is even, the median is the average of the two middle elements
*/
public class FIndMedian {
    public static void main(String[] args) {
        int[] oddSizeArray = {1, 5, 8, 3, 7};
        int[] evenSizeArray = {11, 34, 76, 45};
        System.out.println(getMedian(oddSizeArray));
        System.out.println(getMedian(evenSizeArray));
    }

    public static double getMedian(int[] array) {
        Arrays.sort(array);

        int n = array.length;
        if (n % 2 == 0) {
            return (array[(n - 1) / 2] + array[n / 2]) / 2.0;
        } else {
            return array[n / 2];
        }
    }
}
