package com.core.thread;

public class MyData {
    synchronized  void display (String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }

}
