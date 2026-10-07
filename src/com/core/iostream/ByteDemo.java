package com.core.iostream;

import java.io.ByteArrayInputStream;

public class ByteDemo {
    public static void main(String[] args) throws Exception {
        byte[] b = {'a', 'b' , 'c' , 'd' , 'e', 'f', 'g', 'h', 'i', 'j' };
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        System.out.println(bais.markSupported());
//        int x;
//        while ((x = bais.read()) != -1) {
//            System.out.print((char) x);
//        }
        bais.close();
    }
}
