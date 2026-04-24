package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisplayBookByTitle {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("databaseproperties");

        EntityManager em = emf.createEntityManager();

        Query query =
        em.createQuery("select b from Book b where b.title=?1");

        System.out.println("Enter Book Title");

        query.setParameter(1, sc.next());

        try {

            Book book = (Book) query.getSingleResult();

            System.out.println("Book ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());

        }
        catch(Exception e) {

            System.out.println("Book Not Found");

        }

        em.close();
        emf.close();
        }
    }
}