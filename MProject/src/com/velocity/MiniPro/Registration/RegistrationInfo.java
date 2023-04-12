package com.velocity.MiniPro.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RegistrationInfo {
	
	public void getRegistrationInfo(String fname,String lname,String uname,String password,String city,String mail,String mob) throws SQLException {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			Registration reg=new Registration();
			conn=reg.getConnection();
			//inserting information in database
			
			ps=conn.prepareStatement("insert into registration(FirstName,LastName,UserName,Passwords,City,MailId,MobileNumber)values(?,?,?,?,?,?,?)");
			
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, uname);
			ps.setString(4, password);
			ps.setString(5, city);
			ps.setString(6,mail);
			ps.setString(7, mob);
			
			int a=ps.executeUpdate();
			System.out.println("Record is Inserted"+a);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
			ps.close();
		}
	}
	public static void regCall() throws SQLException {
		System.out.println("Enter your first name");
		Scanner sc=new Scanner(System.in);
		String fname=sc.next();
		
		System.out.println("Enter your lastname");
		String lname=sc.next();
		
		System.out.println("Enter your Username name");
		String uname=sc.next();
		
		System.out.println("Enter your Password");
		String password=sc.next();
		
		System.out.println("Enter your City name");
		String city=sc.next();
		
		System.out.println("Enter your Mail Id");
		String mail=sc.next();
		
		System.out.println("Enter your Mobile Number");
		String mob=sc.next();
		
		RegistrationInfo regInfo=new RegistrationInfo();
		regInfo.getRegistrationInfo(fname, lname, uname, password, city, mail, mob);
		
		sc.close();
			}

}
