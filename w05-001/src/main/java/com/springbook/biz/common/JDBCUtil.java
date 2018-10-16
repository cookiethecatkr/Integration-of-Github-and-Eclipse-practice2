package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {

	public static Connection getConnection() {
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "1234");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
