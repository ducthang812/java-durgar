package com.core.iostream;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
            FileInputStream fis1 = new FileInputStream("D:\\workspace\\udemy\\javacore\\iostream\\source1.txt");
            FileInputStream fis2 = new FileInputStream("D:\\workspace\\udemy\\javacore\\iostream\\source2.txt");
            FileOutputStream fos = new FileOutputStream("D:\\workspace\\udemy\\javacore\\iostream\\destiantion.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            int b;
            while ((b = sis.read()) != -1) {
                fos.write(b);
            }
            sis.close();
            fos.close();
            fis1.close();

    }
}
