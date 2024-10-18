package org.core.java.examples;

public class CourseRating {
    public static void main(String[] args) {
        int calls = 40;
        if(calls<40){
            System.out.println("**");
        } else if (40<=calls && calls<70) {
            System.out.println(("***"));
        }
    }
}
