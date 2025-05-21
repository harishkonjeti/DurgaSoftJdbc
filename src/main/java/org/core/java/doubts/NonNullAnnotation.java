package org.core.java.doubts;

import lombok.NonNull;

import java.util.Optional;

class Test2 {
    public void printMessage(@NonNull String message) {
        System.out.println("message : " + message);
    }

    public void optionalMethod(String message) {
        String msg = Optional.ofNullable(message).orElse("default message");
        System.out.println("msg : " + msg);
    }
}
public class NonNullAnnotation {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.printMessage("Hello");
//        test2.printMessage(null);
        test2.optionalMethod(null);
        test2.optionalMethod("Hi");
    }
}
