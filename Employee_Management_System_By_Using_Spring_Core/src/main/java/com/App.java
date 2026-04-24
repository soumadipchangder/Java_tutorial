package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(DatabaseConnections.class);
        EmployeeDatabaseOperations operations = context.getBean(EmployeeDatabaseOperations.class);
        operations.insertEmployeeDetails();
    }
}

