package org.example.Controller;

import org.example.Model.Customer;
import org.example.Services.CustomerServiceimpl;
import org.example.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerServiceimpl service;

    @PostMapping("/create/customer")
    public void createCustomer(Customer customer){
        service.createCustomer(customer);
    }

    @GetMapping("/get/customer")
    public Iterable<CustomerEntity> getCustomer(){
        return service.getCustomer();
    }
}
