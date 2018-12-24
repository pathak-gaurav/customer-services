package com.gaurav.customerservices.dao;

import com.gaurav.customerservices.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> findAll();

    Customer findBy(Long customerId);

    void delete(Long customerId);
}
