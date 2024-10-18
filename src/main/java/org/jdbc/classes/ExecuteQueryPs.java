package org.jdbc.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExecuteQueryPs {
    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hareesh", "root", "root");
        ) {
            String query = String.join("\n",
                    "Select ",
                     "* from student ",
                     "where first_name = ? or marks <= ?;"
                    );
            System.out.println(query);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "Hareesh");
            preparedStatement.setInt(2, 95);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.print(resultSet.getInt("rollno")+"\t");
                System.out.print(resultSet.getString("first_name")+"\t");
                System.out.print(resultSet.getString("last_name")+"\t");
                System.out.print(resultSet.getInt("marks")+"\t");
                System.out.print(resultSet.getString("email")+"\t");
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
