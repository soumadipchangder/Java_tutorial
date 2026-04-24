package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
//       ApplicationContext context = 
//    		   new AnnotationConfigApplicationContext(EmployeeDetails.class);
       
    	ApplicationContext context = 
    			new AnnotationConfigApplicationContext(EmployeeDetails.class);
    	EmployeeDetails employeeDetails=context.getBean(EmployeeDetails.class);
    	
    	employeeDetails.displayEmployeeDetails();
    	//To make bean of 2 classes by giving comma we can make bean of 2 or more classes
    	//but it is not good approach
    	//WE WILL USE @ComponentScan annotation
    	// @ComponentScan(basePackages=com)
       String[] beanDefinitionNames=context.getBeanDefinitionNames();
       for(String str:beanDefinitionNames) {
    	   System.out.println(str);
       }
    }
}