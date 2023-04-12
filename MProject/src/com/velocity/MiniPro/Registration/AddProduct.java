package com.velocity.MiniPro.Registration;

import java.sql.Connection;
import java.sql.DriverManager;

public class AddProduct {
	// Design method which return the connection object
		public Connection getConnection() {
			Connection con = null;

			try {
				// step 1
				Class.forName("com.mysql.jdbc.Driver");
				// step 2
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb", "root", "root");

			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;
		}

}
