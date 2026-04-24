package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DisplayAllUsers {

    public static void main(String[] args) {

        String fetch = "select user from UserInformation user";

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("databaseproperties");

        EntityManager em = emf.createEntityManager();

        TypedQuery<UserInformation> query = em.createQuery(fetch, UserInformation.class);

        List<UserInformation> users = query.getResultList();

        if(!users.isEmpty()) {

            for(UserInformation u : users) {

                System.out.println("User ID: " + u.getId());
                System.out.println("User Name: " + u.getName());
                System.out.println("User Email: " + u.getEmail());
                System.out.println("User Mobile Number: " + u.getMobilenumber());
                System.out.println("User Gender: " + u.getGender());
                System.out.println("-----------------------------");
            }

        } else {
            System.out.println("No Users Found");
        }

        em.close();
        emf.close();
    }
}