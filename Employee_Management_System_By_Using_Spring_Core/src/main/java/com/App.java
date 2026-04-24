package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try (AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(DatabaseConnections.class)) {
            EmployeeDatabaseOperations operations = context.getBean(EmployeeDatabaseOperations.class);
            operations.insertEmployeeDetails();
        }
    }
}

