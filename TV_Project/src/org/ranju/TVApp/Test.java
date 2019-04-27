package org.ranju.TVApp;

import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the type of TV");
	     String type=sc.next();
	     sc.close();
	     IRemote sw=TVFactory.getTV(type);
	     if(sw!=null)
	     {
	    	 sw.rOn();
	    	 sw.rOff();
	     }
		}


}
