package org.core.java.iostreams;

import java.util.Scanner;

public class I6_scanner {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
        ) {

            System.out.print("Employee Number     : ");
            int eno = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left after nextInt()
            System.out.print("Employee Name       : ");
            String ename = scanner.nextLine();
            System.out.print("Employee Salary     : ");
            float esal = scanner.nextFloat();
            System.out.print("Employee Address    : ");
            String eaddr = scanner.next();

            System.out.println("Employee Details");
            System.out.println("-----------------------");
            System.out.println("Employee Number   : "+eno);
            System.out.println("Employee Name     : "+ename);
            System.out.println("Employee Salary   : "+esal);
            System.out.println("Employee Address  : "+eaddr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
