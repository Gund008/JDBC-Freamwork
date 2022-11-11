package com.model;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Update {
	    public static void main(String arg[]) throws SQLException {

	        try 
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/marvellous","root","");
	            System.out.println("Connection establish successfully");
	            Statement st=conn.createStatement();

	            //String query="Update student set username='rutika' WHERE id='2'";

	            int numberofRowsupdated=st.executeUpdate("Update student set username='rutika' WHERE id='2'");

	            System.out.println("numberofRowsupdated="+ numberofRowsupdated);

	        }
	        catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        
	        
	    }
	    
	}



