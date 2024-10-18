package org.core.java.multithreading;
class GarbageCollector extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Garbage collector");
        }
    }
}
public class Class5DemonThread {
    public static void main(String[] args) {
        GarbageCollector thread = new GarbageCollector();
        thread.setDaemon(true);
        thread.start();
        for (int i=0; i<3; i++){
            System.out.println("main thread");
        }
    }
}
