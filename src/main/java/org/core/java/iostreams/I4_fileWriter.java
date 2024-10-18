package org.core.java.iostreams;

import java.io.FileWriter;

public class I4_fileWriter {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("E:\\code\\java\\fos.txt",true)) {
            String data = "\n Learning Java";
            String data1 = "\n from Durgasoft";
            fileWriter.write(data);
            fileWriter.write(data1.toCharArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("completed");
    }
}
