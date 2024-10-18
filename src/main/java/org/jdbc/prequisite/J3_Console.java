package org.jdbc.prequisite;

import java.io.Console;

public class J3_Console {
    public static void main(String[] args)throws Exception {
        //console won't work in any ide's
        Console console = System.console();
        String uname = console.readLine("User Name : ");
        char[] pwd = console.readPassword("Password : ");
        String upwd = new String(pwd);
        String status = "";
        if(uname.equals("durga") && upwd.equals("durga")){
            status = "User Login Success";
        }else{
            status = "User Login Failure";
        }
        System.out.println("Status : "+status);
    }
}
