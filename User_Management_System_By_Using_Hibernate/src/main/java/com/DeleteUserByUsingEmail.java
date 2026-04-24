package com;

import java.util.*;
import javax.persistence.*;

public class DeleteUserByUsingEmail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String delete = "delete from UserInformation user where user.email=?1";

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("databaseproperties");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        Query query = em.createQuery(delete);

        System.out.println("Enter User Email to Delete");
        String email = sc.next();

        query.setParameter(1, email);

        int result = query.executeUpdate();

        if (result != 0) {
            System.out.println("User Data Deleted Successfully");
        } else {
            System.out.println("No User Found With This Email");
        }

        et.commit();
        em.close();
    }
}