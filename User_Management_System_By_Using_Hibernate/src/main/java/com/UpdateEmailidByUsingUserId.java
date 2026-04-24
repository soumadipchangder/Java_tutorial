package com;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmailidByUsingUserId {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseproperties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		System.out.println("Enter user Id");
		UserInformation info = em.find(UserInformation.class, sc.nextInt());
		if(info!=null) {
			System.out.println("Enter User Email");
			info.setEmail(sc.next());
			em.merge(info);
			System.out.println("Email Updated Successfully");
		} else {
			System.out.println("No Data Found");
		}
		et.commit();
		
		em.close();
		emf.close();
		}
		

	}

}
