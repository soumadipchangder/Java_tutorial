package com.cms.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cms.config.AppConfig;
import com.cms.dao.CustomerDao;
import com.cms.entity.Customer;
import com.cms.util.ValidationUtil;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerDao dao = context.getBean(CustomerDao.class);

		Scanner sc = new Scanner(System.in);

		System.out.println("1 Add Customer");
		System.out.println("2 View Customers");
		System.out.println("3 Update Email");
		System.out.println("4 Delete Customer");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:

			System.out.println("Enter name email mobile password");

			String name = sc.next();
			String email = sc.next();
			String mobile = sc.next();
			String pass = sc.next();

			if (ValidationUtil.emailValid(email) && ValidationUtil.mobileValid(mobile)
					&& ValidationUtil.passwordValid(pass)) {

				Customer c = new Customer(name, email, mobile, pass);

				dao.addCustomer(c);

				System.out.println("Customer Added");

			} else {
				System.out.println("Invalid Data");
			}

			break;

		case 2:

			dao.viewCustomers().forEach(System.out::println);

			break;

		case 3:

			System.out.println("Enter mobile");
			String m = sc.next();

			System.out.println("Enter new email");
			String e = sc.next();

			dao.updateEmail(m, e);

			break;

		case 4:

			System.out.println("Enter password");
			String p = sc.next();

			dao.deleteCustomer(p);

			break;

		}

		sc.close();

	}

}