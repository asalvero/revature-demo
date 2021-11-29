package com.company;

import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws SQLException {
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
        // Demo 1: Create a table
        //String query = "create table student (id integer PRIMARY KEY AUTO_INCREMENT, name char(50), email char(50))";
        //statement.executeUpdate(query);
        //System.out.println("table create successful");

        // Demo 2: Insert data into table
//        String query = " insert into student (name, email) values (?, ?)";
//
//        //get prepareStatement object
//        PreparedStatement preparedStatement = connection.prepareStatement(query);
//        //set the values in query
//        preparedStatement.setString(1, "Mark Smith");
//        preparedStatement.setString(2, "m@gmail.com");
//        //execute query
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("("+ rowAffected + ") rows affected");

        // Demo 3: Update
//        String query = "update student set id = ? where id = ?";
//        PreparedStatement preparedStatement = connection.prepareStatement(query);
//        preparedStatement.setInt(1,2);
//        preparedStatement.setInt(1,1);

        // Demo 4: Delete
        String query = "delete from student where id = 2";
        statement.executeUpdate(query);
        System.out.println("Delete executed");

        connection.close();
        if(connection.isClosed())
            System.out.println("connection closed");
        else
            System.out.println("Connection open");
    }
}
