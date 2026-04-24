package com;

import java.util.*;
import javax.persistence.*;

public class DisplayAllUsers {

    public static void main(String[] args) {

        String fetch = "select user from UserInformation user";

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("databaseproperties");

        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery(fetch);

        List<UserInformation> users = query.getResultList();

        if(users.size() > 0) {

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
    }
}