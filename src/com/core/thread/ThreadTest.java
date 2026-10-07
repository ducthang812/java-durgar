package com.core.thread;

class MyRun implements Runnable {
    public void run() {
        System.out.println("say my name");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRun(), "My name");
    }
}
