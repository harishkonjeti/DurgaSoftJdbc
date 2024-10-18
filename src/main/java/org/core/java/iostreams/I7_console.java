package org.core.java.iostreams;

import java.io.Console;

public class I7_console {
    public static void main(String[] args) {
        Console console = System.console();
        String uname = console.readLine("User Name    : ");
        char[] pwd = console.readPassword("Password     : ");
        String upwd = new String(pwd);

        if(uname.equals("durga") && upwd.equals("durga")){
            System.out.println("User Login Success");
        }else{
            System.out.println("User Login Failure");
        }
    }
}
