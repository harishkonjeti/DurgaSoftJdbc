package org.core.java.iostreams;

import java.io.FileInputStream;

public class I2_fileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\code\\java\\fos.txt");
            int size = fis.available();
            System.out.println(size);
            byte[] bytes = new byte[size];
            System.out.println(fis.read(bytes));
            System.out.println(bytes);
            String str = new String(bytes);
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
