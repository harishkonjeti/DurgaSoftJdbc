package org.corejava.oops;

enum Enum {
    AVAILABLE, BUSY, IDLE
}
public class C9_Enum {
    public static void main(String[] args) {
        System.out.println(Enum.AVAILABLE.getClass().getTypeName());
        System.out.println(Enum.AVAILABLE);
        Enum enumVal = Enum.AVAILABLE;
        String str = String.valueOf(Enum.AVAILABLE);
        System.out.println(str.length());
        System.out.println(Enum.AVAILABLE.toString().getClass().getTypeName());
        System.out.println(Enum.valueOf("BUSY"));
        Enum[] enums = Enum.values();
        System.out.println("enums - " + enums);
        for (Enum enum1:enums) {
            System.out.println(enum1);
        }
        for (int i = 0; i < enums.length; i++){
            System.out.println("i : " + i + " - " + enums[i]);
        }
        System.out.println(Enum.values()[1]);
        System.out.println(Enum.AVAILABLE.name());
    }
}
