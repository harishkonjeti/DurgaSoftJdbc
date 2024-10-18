package org.corejava.oops;

public class C18_TypeCasting {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        int c = a+b;
        long l1 =1l;
        long l2 =2l;
        long l3 = l1+l2;
        byte b1 = (byte) l1;
        System.out.println(c);
        System.out.println(l3);
        System.out.println(b1);
        float f1 = 1.1f;
        float l4 = l1+f1;
        float f2 = 1.3f;
        float f3 = f1+f2;
        System.out.println(f3);
    }
}
