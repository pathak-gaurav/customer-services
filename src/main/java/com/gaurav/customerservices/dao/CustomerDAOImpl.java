package com.gaurav.customerservices.dao;

import com.gaurav.customerservices.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
