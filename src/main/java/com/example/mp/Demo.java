package com.example.mp;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        String locker = "lock";
        String locker2 = "lock2";

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("t1 wait start.");
                synchronized (locker) {
                    locker.wait();
                }
                System.out.println("t1 wait end.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();

        Thread.sleep(1000);


        Thread t2 = new Thread(() -> {
            System.out.println("t2 notify start.");
            synchronized (locker2) {
                locker.notify();
            }
            System.out.println("t2 notify end.");
        });
        t2.start();

    }

}
