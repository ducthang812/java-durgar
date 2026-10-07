package com.core.generics;

public class App<T> {
    T data[] = (T[]) new Object[3];
    public static void main(String[] args) {
        App<Integer> app = new App();
        app.data[0] = new Integer(14);
        app.data[1] =(Integer) 2;
        app.data[2] =(Integer) 3;
    }
}
