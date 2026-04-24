package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ViewAllBooks {

    public static void main(String[] args) {

        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("databaseproperties");

        EntityManager em = emf.createEntityManager();

        TypedQuery<Book> query = em.createQuery("select b from Book b", Book.class);

        List<Book> list = query.getResultList();

        for(Book b : list) {

            System.out.println("Book ID: " + b.getId());
            System.out.println("Title: " + b.getTitle());
            System.out.println("Author: " + b.getAuthor());
            System.out.println("Price: " + b.getPrice());

            System.out.println("--------------------");
        }

        em.close();
        emf.close();
    }
}