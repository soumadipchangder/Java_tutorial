package com;

import java.util.Scanner;
import javax.persistence.*;

public class UpdateBookPrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("databaseproperties");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        String update =
        "update Book b set b.price=?1 where b.id=?2 and b.author=?3";

        Query query = em.createQuery(update);

        System.out.println("Enter New Price");
        query.setParameter(1, sc.nextDouble());

        System.out.println("Enter Book ID");
        query.setParameter(2, sc.nextInt());

        System.out.println("Enter Author Name");
        query.setParameter(3, sc.next());

        et.begin();

        int result = query.executeUpdate();

        if(result != 0)
            System.out.println("Book Price Updated");
        else
            System.out.println("Book Not Found");

        et.commit();

        em.close();
    }
}