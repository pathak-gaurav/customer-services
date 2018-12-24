package com.gaurav.customerservices.service;

import com.gaurav.customerservices.entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {


    @Override
    public List<Customer> findAll() {
        return null;
    }
}
