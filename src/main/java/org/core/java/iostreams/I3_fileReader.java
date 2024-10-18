package org.core.java.iostreams;

import java.io.FileReader;

public class I3_fileReader {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("E:\\code\\java\\fos.txt")) {
            String data = "";
            //Read char by char in the form of its ASCII value.
            int val = fileReader.read();
            //End of file Ascii value is -1
            while (val != -1){
                //Convert char by char from ASCII value to character
                //Append char by char to a String variable.
                data = data + (char)val;
                val = fileReader.read();
            }
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
