package org.core.java.wrapper;

public class W1_WrapperClass {

    public static void main(String[] args) {
        int i = 10;
        String stringVal = "15";
        Integer integerValue = 20;

        Integer integerFromInt = i;
        Integer integerValueOfFromInt = Integer.valueOf(12);
        Integer integerFromString = Integer.valueOf("13");
        System.out.println("integerFromInt : " + integerFromInt);
        System.out.println("integerValueOfFromInt : " + integerValueOfFromInt);
        System.out.println("integerFromString : " + integerFromString);


        int i3 = Integer.parseInt(stringVal);
        int i4 = integerValue;
        System.out.println("int from string : " + i3);
        System.out.println("int from Integer : " + i4);

        String s1 = Integer.toString(i);
        String s2 = integerValue.toString();
        System.out.println("string from int : " + s1);
        System.out.println("string from Integer : " + s2);
//        Integer integer1 = i;
//        String stringVal1 = Integer.toString(i);
//        int i1 = integerValueOfFromInt;
//        int i2 = integerValueOfFromInt.intValue();
//        String stringVal2 = integerFromString.toString();
//        System.out.println(stringVal2);
    }
}
