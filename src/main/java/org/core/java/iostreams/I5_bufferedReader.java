package org.core.java.iostreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I5_bufferedReader {
    public static void main(String[] args) {
        try (
                BufferedReader bufferedReader = new
                        BufferedReader(new InputStreamReader(System.in));
        ) {
            System.out.print("Enter Data   : ");
            String data = bufferedReader.readLine();
            System.out.print("Enter the same Data Again  : ");
            int val = bufferedReader.read();
            System.out.println("readLine()    : " + data);
            System.out.println("read()        : " + val + "[" + (char) val + "]");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
