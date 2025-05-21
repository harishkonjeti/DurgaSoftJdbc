package org.core.java.multithreading;

class WelcomeThread extends Thread{
    @Override
    public void run() {
        for (int i =0; i<10; i++){
        System.out.println("Welcome Thread : " + i);
        }
    }
}
public class Class1 {
    public static void main(String[] args) {
        WelcomeThread wt = new WelcomeThread();
        wt.start();
        for (int i=0; i<10; i++){
            System.out.println("Main Thread : " + i);
        }
//        wt.start();
        Thread thread = new Thread();
        System.out.println(thread);
    }
}
