package com.example.springtest;

import java.sql.*;

public class callableStatement {
    //驱动
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //路径
    static final String DB_URL = "jdbc:mysql://localhost/hvi";
    static final String USER = "root";
    static final String PASS = "root";

    public void callableTest() {
        Connection conn = null;
        CallableStatement stmt = null;
        //STEP 2: Register JDBC driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
