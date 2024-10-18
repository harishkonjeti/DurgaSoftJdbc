package org.core.java.multithreading;
class WelcomeThread2 implements Runnable {

    @Override
    public void run() {
        for (int i =0; i<20; i++){
            System.out.println("Welcome Thread : " + i);
        }
    }
}
public class Class2 {
    public static void main(String[] args) {
        WelcomeThread2 wt = new WelcomeThread2();
//        wt.start()//compilation error --> No start method in WelcomeThread2 and Runnable interface
//        wt.run();  // only main thread, no new thread is created
        Thread th = new Thread();
//        th.start();//only main thread is executed, as run method is empty in thread class
        Thread th2 = new Thread(wt);
        th2.start(); // runs main method and above overridden method
//        Thread th3 = new WelcomeThread2();
//        th3.start();
        for (int i=0; i<20; i++){
            System.out.println("Main Thread : " + i);
        }
    }
}
