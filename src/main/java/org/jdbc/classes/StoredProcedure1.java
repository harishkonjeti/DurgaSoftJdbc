package org.jdbc.classes;

import java.sql.*;

public class StoredProcedure1 {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hareesh","root","root");
        ) {
            CallableStatement callableStatement = connection.prepareCall("{call getMarks(?,?)}");
            callableStatement.setInt(1,5);
            callableStatement.registerOutParameter(2,Types.INTEGER);
            callableStatement.execute();
            int marks = callableStatement.getInt(2);
            System.out.println(marks);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
