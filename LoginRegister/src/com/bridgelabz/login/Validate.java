package com.bridgelabz.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
	 public static boolean checkUser(String USERNAME,String EMAIL,String  PASSWORD ) 
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                 ("jdbc:mysql:/ /localhost:3306/RANJITHA","root","ROOT");
 
         PreparedStatement ps =con.prepareStatement
                             ("select * from LOGIN where USERNAME=?,EMAIL=?,PASSWORD=?");
         ps.setString(1, USERNAME );
         ps.setString(2, EMAIL);
         ps.setString(3, PASSWORD);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   

}