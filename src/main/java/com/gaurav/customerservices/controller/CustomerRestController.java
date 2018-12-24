package com.gaurav.customerservices.controller;

import com.gaurav.customerservices.entity.Customer;
import com.gaurav.customerservices.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    private CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public List<Customer> getCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/customer/{customerId}")
    public Customer findCustomer(@PathVariable int customerId) {
        return customerService.findBy(customerId);
    }

}
