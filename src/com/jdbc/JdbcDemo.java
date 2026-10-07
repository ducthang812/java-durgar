package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("ld","fd","fd");

    }
}
