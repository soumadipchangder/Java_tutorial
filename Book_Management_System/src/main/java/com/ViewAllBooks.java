package com;

import java.util.*;
import javax.persistence.*;

public class ViewAllBooks {

    public static void main(String[] args) {

        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("databaseproperties");

        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("select b from Book b");

        List<Book> list = query.getResultList();

        for(Book b : list) {

            System.out.println("Book ID: " + b.getId());
            System.out.println("Title: " + b.getTitle());
            System.out.println("Author: " + b.getAuthor());
            System.out.println("Price: " + b.getPrice());

            System.out.println("--------------------");
        }

        em.close();
    }
}