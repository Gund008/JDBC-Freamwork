package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Excuteupdate {
	public static void main(String arg[]) throws ClassNotFoundException, SQLException {

	Class.forName("com.mysql.jdbc.Driver");
	String password;
	String username;
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/marvellous","root","");
	//System.out.println("Connection successful");
	
	Statement stmt=conn.createStatement();

    ResultSet rs=stmt.executeQuery("Select *from student");

    while(rs.next())
    {
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
    }
    conn.close();
    

	
	
	}
}
