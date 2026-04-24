package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StepsOfJDBC {
	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
		System.out.println("Enter employee id");
		int id=sc.nextInt();
		System.out.println("Enter employee name:");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter employee mobile number");
		long mobileNo=sc.nextLong();
		System.out.println("Enter employee dept no");
		int deptNo=sc.nextInt();
		System.out.println("Enter employee salary");
		double sal=sc.nextDouble();
		
		String insert="insert into iem.employee_details values (?,?,?,?,?)";
		
		/*STEP 1 --> 
		 * Load the driver class*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded successfully...");
		/*STEP 2 -->
		 * Establish the connection*/
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Soumya@7");
		System.out.println("Connection successful!!");
		/*STEP 3 -->
		 * Create platform*/
		PreparedStatement preparedStatement =connection.prepareStatement(insert);
		System.out.println("Before setting values "+preparedStatement);
		preparedStatement.setInt(1,id);
		preparedStatement.setString(2,name);
		preparedStatement.setLong(3,mobileNo);
		preparedStatement.setInt(4,deptNo);
		preparedStatement.setDouble(5,sal);
		System.out.println("After setting values "+preparedStatement);
		System.out.println("Platform created successful!!");
		/*STEP 4 -->
		 * Execute query*/
		int result=preparedStatement.executeUpdate();
		
		if(result!=0) {
			System.out.println("Data inserted successfully!!!");
		}
		else {
			System.out.println("Data inserted un-successfully!!");
		}
		
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Database operation failed: " + e.getMessage());
		}
		}
	}
}
