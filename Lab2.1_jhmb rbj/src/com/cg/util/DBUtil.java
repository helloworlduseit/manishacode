package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil 
{
	public static Connection getcon() throws SQLException
	{
		Connection con=null;
		con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:XE", "System", "Capgemini123");
		return con;
	}

}
