package com.hackerranck;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Runnable obj1 = () -> {
            for (int i=0; i<4; i++) {
                System.out.println("Hi" + " " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i=0; i<4; i++) {
                System.out.println("Hello" + " " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1, "Hi thread");
        Thread t2 = new Thread(obj2, "Hello thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        Thread.sleep(10);
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
