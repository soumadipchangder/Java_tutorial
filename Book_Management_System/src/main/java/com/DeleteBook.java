package com;

import java.util.Scanner;
import javax.persistence.*;

public class DeleteBook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("databaseproperties");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        System.out.println("Enter Book ID");

        int id = sc.nextInt();

        Query query =
        em.createQuery("delete from Book b where b.id=?1");

        query.setParameter(1, id);

        et.begin();

        int result = query.executeUpdate();

        if(result!=0)
            System.out.println("Book Deleted Successfully");
        else
            System.out.println("Book Not Found");

        et.commit();

        em.close();
    }
}