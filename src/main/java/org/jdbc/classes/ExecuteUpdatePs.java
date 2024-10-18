package org.jdbc.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExecuteUpdatePs {
    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hareesh", "root", "root");
                PreparedStatement preparedStatement = connection.prepareStatement("insert into student(first_name,last_name,marks,email) values(?,?,?,?)");
        ) {
            preparedStatement.setString(1, "pavan");
            preparedStatement.setString(2, "kalyan");
            preparedStatement.setInt(3, 99);
            preparedStatement.setString(4, "pavan@gmail.com");
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("rowCount : " + rowCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
