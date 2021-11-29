package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Step 1: Load the driver
        //Class.forName("jdbc:mysql.jdbc.Driver");

        // Step 2: Creating Connection Object
        String url = "jdbc:mysql://localhost:3306/revature";
        String username = "root";
        String password = "tmblrbyz";
        Connection connection = DriverManager.getConnection(url, username, password);

        // Step 3: Create Statement Object
        Statement statement = connection.createStatement();

        // Step 4: Execute Query
        // CRUD
        // C- CREATE

        // R- READ
        String sql = "Select * from employee";
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            System.out.println("ID: "+resultSet.getInt(1)+", Name: "+resultSet.getString(2)+", Email: "+resultSet.getString(3));
        }

        // Step 5: Close connection
        connection.close();
    }
}
