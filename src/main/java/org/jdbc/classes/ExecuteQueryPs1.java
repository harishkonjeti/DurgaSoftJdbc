package org.jdbc.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExecuteQueryPs1 {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hareesh","root","root");
                ) {
            String name = "Hareesh";
            int val = 95;
            String query = "Select * from student where first_name = '" + name + "' or marks <=" + val;
            System.out.println(query);
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                System.out.print(rs.getString("first_name")+"\t");
                System.out.print(rs.getInt("marks")+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
