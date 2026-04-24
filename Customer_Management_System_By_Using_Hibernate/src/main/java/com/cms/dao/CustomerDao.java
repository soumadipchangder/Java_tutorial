package com.cms.dao;

import java.util.List;
import com.cms.entity.Customer;

public interface CustomerDao {

void addCustomer(Customer c);

List<Customer> viewCustomers();

void updateEmail(String mobile,String email);

void deleteCustomer(String password);

}