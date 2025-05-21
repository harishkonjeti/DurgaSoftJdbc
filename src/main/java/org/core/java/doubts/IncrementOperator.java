package org.core.java.doubts;

public class IncrementOperator {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("post increment: " + i);
        }
        for (int i = 0; i < 5; i=++i) {
            System.out.println("pre increment: " + i);
        }
        int j = 2;
        for (int i=0; i<5; i++){
            int k = j++;
            System.out.println("j:"+j);
            System.out.println("k:"+k);
        }
        int l = 2;
        for (int i=0; i<5; i++){
            int m = ++l;
            System.out.println("l:"+l);
            System.out.println("m:"+m);
        }
    }
}
