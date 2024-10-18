package org.core.java.iostreams;

import java.io.FileOutputStream;

public class I1_fileOutputStream {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("E:\\code\\java\\fos.txt",true)){
            String data = "Hello World!";
            byte[] byteArray = data.getBytes();
            fos.write(byteArray);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
