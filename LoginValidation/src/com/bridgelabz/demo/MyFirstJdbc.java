package com.bridgelabz.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;



public class MyFirstJdbc {
public static void main(String[] args) throws SQLException,IOException
{
	
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	try
	{   //Load the driver
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		//Get the DB Connection
		String dburl = "jdbc:mysql://localhost:3306/RANJITHA?user=root&password=ROOT";
		con = DriverManager.getConnection(dburl);
		//Issue SQL queries
		String query = " Select * from student ";
		
		stmt = con.createStatement();
		rs = stmt.executeQuery(query);//Execute the Query
		
		while(rs.next())
		{
			
			String ID = rs.getString("ID");
			String NAME = rs.getString("NAME");
			String AGE = rs.getString("AGE");
			
			System.out.println("ID :"+ID);
			System.out.println("NAME :"+NAME);
			System.out.println("AGE :"+AGE);
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
    finally
    {
    	//Close the objects 
    	try
    	{
    		if(con!=null)
    		{
    			con.close();
    		}
    		if(stmt!=null)
    		{
    			stmt.close();
    		}
    		if(rs!=null)
    		{
    			rs.close();
    		}
    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    }
}


}