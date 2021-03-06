package com.gaurav.customerservices.controller;

import com.gaurav.customerservices.entity.Customer;
import com.gaurav.customerservices.exception.CustomerNotFound;
import com.gaurav.customerservices.service.CustomerService;
import org.springframework.web.bind.annotation.*;

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
    public Customer findCustomer(@PathVariable Long customerId) {
        Customer customer = customerService.findBy(customerId);
        if (customer == null) {
            throw new CustomerNotFound("Customer not found - " + customerId);
        }
        return customerService.findBy(customerId);
    }

    @DeleteMapping("/customer/{customerId}")
    public String deleteCustomer(@PathVariable Long customerId) {
        Customer customer = customerService.findBy(customerId);
        if (customer == null) {
            throw new CustomerNotFound("Customer not found - " + customerId);
        }
        customerService.delete(customerId);
        return "Customer Deleted - " + customerId;
    }

    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
        return customer;
    }

    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        customer.setCustomerId(0L);
        customerService.saveCustomer(customer);
        return customer;
    }

}
