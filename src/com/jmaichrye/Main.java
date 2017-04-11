package com.jmaichrye;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {

        //Setup connection
        Connection connection = MySQLConnect.setupConnection();

        //Setup statement string
        String sql = "select * from country";

        //Initialize statement
        Statement statement = connection.createStatement();

        //Get result set
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }

        connection.close();

    }
}
