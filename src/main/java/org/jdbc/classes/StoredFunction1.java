package org.jdbc.classes;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredFunction1 {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hareesh","root","root");
        ) {
            CallableStatement callableStatement = connection.prepareCall("{?=call getAvgMarks(?,?)}");
            callableStatement.setInt(2,1);
            callableStatement.setInt(3,4);
            callableStatement.registerOutParameter(1, Types.FLOAT);
            callableStatement.execute();
            float marks = callableStatement.getFloat(1);
            System.out.println(marks);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
