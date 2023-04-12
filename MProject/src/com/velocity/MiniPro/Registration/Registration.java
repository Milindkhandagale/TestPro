package com.velocity.MiniPro.Registration;

import java.sql.Connection;
import java.sql.DriverManager;

public class Registration {
	//design a method which return the connection object
		public Connection getConnection() {
			Connection con=null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","root","root");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return con;
			
		}

}
