package com.cms.dao;

import java.util.List;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cms.entity.Customer;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao{

@PersistenceContext
private EntityManager em;

public void addCustomer(Customer c){
em.persist(c);
}

public List<Customer> viewCustomers(){
return em.createQuery("from Customer",Customer.class)
.getResultList();
}

public void updateEmail(String mobile,String email){

em.createQuery("update Customer c set c.email=:e where c.mobile=:m")
.setParameter("e",email)
.setParameter("m",mobile)
.executeUpdate();
}

public void deleteCustomer(String password){

em.createQuery("delete from Customer c where c.password=:p")
.setParameter("p",password)
.executeUpdate();
}

}