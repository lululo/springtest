package com.example.springtest;

import java.sql.*;

public class JDBCDemo {
    //驱动
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //路径
    static final String DB_URL = "jdbc:mysql://localhost:3306/hvi";
    static final String USER = "root";
    static final String PASS = "root";
    public void commit(){
        Connection conn = null;
        Statement stmt = null;
        try {
            //加载到jvm虚拟机
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Connecting to database...");

        try {
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //关闭自动事务
            conn.setAutoCommit(false);
            System.out.println("Creating statement...");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql;
            sql = "INSERT into test (ID,name) VALUES (10,'yyq')";
            stmt.executeUpdate(sql);
            String sql1;
            sql1 = "INSERT into test VALUES (11,'adasdasd')";
            stmt.executeUpdate(sql1);
            conn.commit();


            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





    public void mysqlTest(){
        Connection conn = null;
        Statement stmt = null;
        try {
            //加载到jvm虚拟机
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Connecting to database...");
        try {
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            conn.setAutoCommit(false);
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM hvibottle;";
            ResultSet rs = stmt.executeQuery(sql);
            sql = "SELECT * FROM hvibottlecopy";
            stmt = conn.createStatement();
            ResultSet rs1 = stmt.executeQuery(sql);
            while(rs.next()){
                //Retrieve by column name
                String first = rs.getString("编号");
                String last = rs.getString("类别");
                //Display values
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }
            while(rs1.next()){
                //Retrieve by column name
                int first = rs1.getInt("TOID");
                String last = rs1.getString("ID");

                //Display values
                System.out.print(", TOID: " + first);
                System.out.println(", Last: " + last);
            }
            rs1.close();
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
