package org.jdbc.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteQuery {
    public static void main(String[] args) throws Exception {
        try (
                //Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hareesh", "root", "root");
                Statement statement = connection.createStatement();
                ) {
            //ResultSet resultSet = statement.executeQuery("select * from student");
            int rowCount = statement.executeUpdate("insert into student values(Null,'Mahesh','babu',96,'mahesh@gmail.com')");
            System.out.println("rows updated : " + rowCount);
        }
        catch (Exception e){
            System.out.println("exception : " + e);
        }
    }
}
