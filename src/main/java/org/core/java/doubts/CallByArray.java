package org.core.java.doubts;

public class CallByArray {
    public static void main(String[] args) {
//        int[] intArray = new int[5];
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("before method call : " + intArray);
        for (int i : intArray) {
            System.out.println(i);
        }
        changeArrayElements(intArray);
        System.out.println("after method call : " + intArray);
        for (int i : intArray) {
            System.out.println(i);
        }
        int[] duplicateArray = intArray;
        duplicateArray[0] = 8;
        System.out.println("after reassignment intArray : " + intArray);
        for (int i : intArray) {
            System.out.println(i);
        }
        System.out.println("after reassignment duplicateArray : " + duplicateArray);
        for (int i : duplicateArray) {
            System.out.println(i);
        }
    }

    private static void changeArrayElements(int[] intArray) {
        intArray[0] = 6;
    }
}
