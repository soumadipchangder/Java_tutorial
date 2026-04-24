package com;

import java.util.*;
import javax.persistence.*;

public class DisplayUserByEmail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fetch = "select user from UserInformation user where user.email=?1";

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("databaseproperties");

        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery(fetch);

        System.out.println("Enter User Email");
        String email = sc.next();

        query.setParameter(1, email);

        try {

            UserInformation user = (UserInformation) query.getSingleResult();

            System.out.println("User ID: " + user.getId());
            System.out.println("User Name: " + user.getName());
            System.out.println("User Email: " + user.getEmail());
            System.out.println("User Mobile Number: " + user.getMobilenumber());
            System.out.println("User Gender: " + user.getGender());

        } 
        catch(NoResultException e) {
            System.out.println("No User Found With This Email");
        }

        em.close();
        
    }
}