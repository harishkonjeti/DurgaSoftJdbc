package org.corejava.oops;

import org.core.java.collections.ArraylistClass;

public class C22_BitwiseShiftExample {
    public static void main(String[] args) {
        int permissions = 0b0101; // Read + Execute

        // Bitwise AND
        if ((permissions & 0b0001) != 0) {
            System.out.println("Execute permission granted");
        }

        // Bitwise OR
        permissions = permissions | 0b0010; // Add Write permission

        // Bitwise XOR
        permissions = permissions ^ 0b0100; // Toggle Read permission

        // Bitwise Complement
        int inverted = ~permissions;
        System.out.println("Inverted permissions: " + inverted);

        // Left Shift
        int multiplied = 5 << 1; // 5 * 2 = 10
        System.out.println("Left shift result: " + multiplied);

        // Right Shift
        int divided = 20 >> 2; // 20 / 4 = 5
        System.out.println("Signed right shift result: " + divided);

        // Unsigned Right Shift
        int number = -8;
        int unsignedShift = number >>> 2;
        System.out.println("Unsigned right shift result: " + unsignedShift);

        int i = 1024;
        byte b = (byte)i;
        System.out.println("b:"+b);

        C21_InstanceOf obj = new C21_InstanceOf();
        ArraylistClass obj2 = new ArraylistClass();
    }
}
