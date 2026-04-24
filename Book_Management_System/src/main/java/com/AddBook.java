package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddBook {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("databaseproperties");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Book book = new Book();

        System.out.println("Enter Book Title");
        book.setTitle(sc.next());

        System.out.println("Enter Author Name");
        book.setAuthor(sc.next());

        System.out.println("Enter Book Price");
        book.setPrice(sc.nextDouble());

        et.begin();
        em.persist(book);
        et.commit();

        System.out.println("Book Added Successfully");

        em.close();
        emf.close();
        }
    }
}