package com;
import java.util.*;
import javax.persistence.*;

public class UpdateMobileNumberByUsingEmail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String update = "update UserInformation user set user.mobilenumber=?1 where user.email=?2";
		EntityManagerFactory emf = 
		Persistence.createEntityManagerFactory("databaseproperties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Query query = em.createQuery(update);
		System.out.println(query);
		
		System.out.println("Enter User MobileNumber");
		long mb=sc.nextLong();
		query.setParameter(1,mb);
		
		System.out.println("Enter User Email");
		String email=sc.next();
		query.setParameter(2,email);
		
		int result = query.executeUpdate();
		if(result!=0) {
			System.out.println("Data Updated");
		} else {
			System.out.println("No Data Updated");
		}
		et.commit();
		em.close();

	}

}
