package org.jdbc.prequisite;

import java.io.FileInputStream;
import java.io.IOException;

public class J5_FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\code\\java\\Welcome.txt");
        int size = fis.available();
        byte[] bytes = new byte[size];
        fis.read(bytes);
        String data = new String(bytes);
        System.out.println("data from file : " + data);
    }
}
