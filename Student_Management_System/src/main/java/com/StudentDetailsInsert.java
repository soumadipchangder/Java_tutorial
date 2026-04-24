package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDetailsInsert {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student name");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Student percentage");
		String percent=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter student stream");
		String stream=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter student degree");
		String dept=sc.next();
		sc.nextLine();
		System.out.println("Enter student email id");
		String email=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter student gender");
		String gender=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter student DOB");
		String date=sc.nextLine();
		Date dob= Date.valueOf(date);
		System.out.println("Enter student mobile number");
		long mobileNo=sc.nextLong();
		
		String insert="insert into student_management_system.student_details(Student_Name, Student_Percentage, Student_Stream, Student_Degree, Student_EmailID, Student_Gender, Student_DOB, Student_Mobile_Number) values (?,?,?,?,?,?,?,?)";
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
		preparedStatement.setString(1,name);
		preparedStatement.setString(2,percent);
		preparedStatement.setString(3,stream);
		preparedStatement.setString(4,dept);
		preparedStatement.setString(5,email);
		preparedStatement.setString(6,gender);
		preparedStatement.setString(7,date);
		preparedStatement.setLong(8,mobileNo);
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
		
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}