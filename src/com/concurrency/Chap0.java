package com.concurrency;

public class Chap0  {
    public final static int max = 1000;
    public Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {

        int turn = 0;
        Thread thread1 = new Thread(new ThreadOdd());
        Thread thread2 = new Thread(new ThreadEven());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("end");
    }
}

class ThreadOdd implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < Chap0.max; i+=2) {
//            synchronized ()
        }
    }
}

class ThreadEven implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Chap0.max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
