package org.core.java.multithreading;

public class Class3 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println(thread);
        Thread thread1 = new Thread("core java");
        System.out.println(thread1);
        Runnable thread2 = new Thread();
        Thread thread3 = new Thread(thread2);
        System.out.println(thread3);
        Thread thread4 = new Thread(thread2,"core java name");
        System.out.println(thread4);
        ThreadGroup threadGroup = new ThreadGroup("group name");
        Thread thread5 = new Thread(threadGroup,"java thread name");
        System.out.println(thread5);
        Thread thread6 = new Thread(threadGroup,thread2);
        Thread thread7 = new Thread(threadGroup,thread2,"java name");
        System.out.println(thread7);
    }
}
