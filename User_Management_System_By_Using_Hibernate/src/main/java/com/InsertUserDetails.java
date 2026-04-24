package com;
import java.util.Scanner;
import javax.persistence.*;

public class InsertUserDetails {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		/* 1) Load the Persistence.xml file */
		EntityManagerFactory emf=
		Persistence.createEntityManagerFactory("databaseproperties");
		
		/* 2) Establish The Connection
		 * 3) Create the platform
		 */
		
		EntityManager em = emf.createEntityManager();
		System.out.println("My Persistence.xml file info: "+ em.getProperties());
		EntityTransaction et = em.getTransaction();
		
		/* 4) Begin the Transaction */
		
		et.begin();
		UserInformation userinfo = new UserInformation();
		System.out.println("Enter User Name");
		userinfo.setName(sc.next());
		System.out.println("Enter user Email");
		userinfo.setEmail(sc.next());
		System.out.println("Enter user Mobile Number");
		userinfo.setMobilenumber(sc.nextLong());
		System.out.println("Enter user Gender");
		userinfo.setGender(sc.next());
		System.out.println(userinfo);
		
		em.persist(userinfo);
		System.out.println("Data Inserted");
		
		/* 5) Perform the Operations
		 * Insert
		 * Update
		 * Delete
		 * Select*/
		/* If it is Insert or Update or Delete
		 * 6) Commit the Transaction
		 */
		
		et.commit();
		
		/* 7) Close Connection */
		
		em.close();
		
		
	}

}
