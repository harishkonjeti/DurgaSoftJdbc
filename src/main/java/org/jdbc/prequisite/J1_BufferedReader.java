package org.jdbc.prequisite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1_BufferedReader {
    public static void main(String[] args) throws IOException {
        //carry data in the form of characters
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Data for readline method : ");
        //to read a line of data in the form of a String
        String readLineData = br.readLine();

        //reading int input or primitive data types
        System.out.print("Enter int Data : ");
        //Read data from command prompt as String data
        String intInput = br.readLine();
        //Convert data from String type to the respective primitive type
        int intData = Integer.parseInt(intInput);

        //reading float input
        System.out.print("Enter float Data : ");
        String floatInput = br.readLine();
        float floatData = Float.parseFloat(floatInput);

        System.out.print("Enter Data for read method : ");
        // read a single character in the form of its ASCII value
        int readData = br.read();

        System.out.println("Data from read line method : " + readLineData);
        System.out.println("Data from read method : " + readData + "[" +(char)readData + "]");
        System.out.println("int Data : " + intData);
        System.out.println("float Data : " + floatData);

    }
}
