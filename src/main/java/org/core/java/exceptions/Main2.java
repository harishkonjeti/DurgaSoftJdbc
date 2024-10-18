package org.core.java.exceptions;

public class Main2 {
    public static void main(String[] args) {
        try{
            float f = 100/0;
        }
        catch(Exception e){
            System.out.println("Exception starts...");
            System.out.println();
            e.printStackTrace();
        }
    }
}
