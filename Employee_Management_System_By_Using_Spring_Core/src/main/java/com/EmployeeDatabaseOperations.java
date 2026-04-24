package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDatabaseOperations {

    @Autowired
    DatabaseConnections databaseconnections;
    
    @Autowired
    @Qualifier("scannerBean1")
    Scanner sc;

    public void insertEmployeeDetails() {

        try {

            Connection con = databaseconnections.mysqlDbConnection();

            // Create table if not exists
            String createTable = "CREATE TABLE IF NOT EXISTS employees (" +
                    "empId INT PRIMARY KEY, " +
                    "empName VARCHAR(50), " +
                    "empSalary DOUBLE, " +
                    "empDepartment VARCHAR(50))";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTable);

            System.out.println("Enter Employee ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Employee Name:");
            String name = sc.nextLine();

            System.out.println("Enter Employee Salary:");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter Employee Department:");
            String dept = sc.nextLine();

            String insert = "INSERT INTO employees VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(insert);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);
            ps.setString(4, dept);

            ps.executeUpdate();

            System.out.println("Employee inserted successfully");

        } 
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}