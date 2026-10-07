package com.core.iostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\workspace\\udemy\\javacore\\iostream\\test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.println((char) bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.mark(10);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
    }
}
