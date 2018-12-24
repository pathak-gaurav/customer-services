package com.gaurav.customerservices.service;

import com.gaurav.customerservices.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer findBy(Long customerId);

    void delete(Long customerId);

    Customer saveOrUpdateCustomer(Customer customer);
}
