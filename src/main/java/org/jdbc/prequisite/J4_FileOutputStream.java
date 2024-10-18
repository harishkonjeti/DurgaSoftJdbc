package org.jdbc.prequisite;

import java.io.FileOutputStream;
import java.io.IOException;

public class J4_FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\code\\java\\Welcome.txt",true);
        String inputData = "Welcome to java";
        byte[] bytes = inputData.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
