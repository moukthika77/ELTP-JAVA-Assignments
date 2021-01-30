package com.psl.learning.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class BasicDemo{  
public static void main(String args[]){  
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	try
	{
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","db_user","db_user");
		String sql="select * from employee";
		pst=con.prepareStatement(sql);
		rs=pst.executeQuery();
		while(rs.next())
			System.out.println(rs.getInt(1));
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}  
}