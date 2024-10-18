package org.core.java.doubts;

class UserDefinedException extends Exception{
    public UserDefinedException() {
    }

    public UserDefinedException(String message) {
        super(message);
    }

    public UserDefinedException(String message, Throwable cause) {
        super(message, cause);
    }
}
class D {
    void m1() throws Exception {
        m2();
    }

    void m2() {
        throw new RuntimeException("Mock exception");
    }
}

public class ThrowsClass {
    public static void main(String[] args) throws UserDefinedException {

        D d = new D();
        try {
            d.m1();
        } catch (Exception e) {
            System.out.println("e : " + e);
            System.out.println("message : " + e.getMessage());
            System.out.println("cause : " + e.getCause());
            throw new UserDefinedException("string error message");
//            try {
//                throw new UserDefinedException("string error message",e);
//            } catch (UserDefinedException exc) {
//                System.out.println("user defined exception: " + exc);
//            }
        }
    }

}
