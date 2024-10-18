package org.jdbc.classes;

import java.sql.*;

public class StoredProcedure2 {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hareesh","root","root");
        ) {
            CallableStatement callableStatement = connection.prepareCall("{call getAllStudents()}");
            boolean hasResults = callableStatement.execute();
            if (hasResults){
                ResultSet resultSet = callableStatement.getResultSet();
                while (resultSet.next()){
                    System.out.print(resultSet.getInt("rollno")+ "\t");
                    System.out.print(resultSet.getString("first_name") + "\t");
                    System.out.print(resultSet.getInt("marks") + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
