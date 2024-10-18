package org.core.java.exceptions;
class Test1{
    void m1() throws RuntimeException{
        m2();
    }
    void m2() throws RuntimeException{
        throw new RuntimeException("mock exception");
    }
}
public class Main1 {
    public static void main(String[] args) throws RuntimeException {
        Test1 obj1 = new Test1();
        try{
//        obj1.m1();
            float f = 100/0;
        }
        catch (Exception e){
            System.out.println("Exception starts...");
            System.out.println();
            e.printStackTrace();
            System.out.println();

            System.out.println("e : " + e);
            System.out.println();

            System.out.println(e.getMessage());
            System.out.println();
            System.out.println(e.getCause());
            System.out.println();
            System.out.println(e.getLocalizedMessage());
            System.out.println();
            System.out.println(e.getClass());
            System.out.println();
            System.out.println(e.getStackTrace());
        }
    }
}
