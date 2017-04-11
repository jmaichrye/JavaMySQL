package com.jmaichrye;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Jon Maichrye on 4/11/2017.
 */
public class MySQLConnect {
    final static String mySQLUsername = "root";
    final static String password = "root";
    final static String connectionContactsRoot = "jdbc:mysql://localhost:3306/world";

    public static Connection setupConnection () throws SQLException {
        return DriverManager.getConnection(connectionContactsRoot, mySQLUsername, password );
    }

}
