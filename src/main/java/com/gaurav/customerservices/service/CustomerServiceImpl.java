package com.gaurav.customerservices.service;

import com.gaurav.customerservices.dao.CustomerDAO;
import com.gaurav.customerservices.entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
