package org.core.java.multithreading;

public class Class4 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        System.out.println(thread.getName());
        thread.setName("MyThread");
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        thread.setPriority(8); // values must be between 1 to 10 only
        System.out.println(thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getPriority());
        System.out.println(Thread.activeCount());
        System.out.println(thread.isAlive());
        thread.start();
        System.out.println(thread.isAlive());
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(3000);
        System.out.println("3 secs delay response");
        thread.join();// thread obj will be executed first and then main thread
    }
}
