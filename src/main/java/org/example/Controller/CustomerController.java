package org.example.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Model.Customer;
import org.example.Services.CustomerServiceimpl;
import org.example.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@Slf4j
public class CustomerController {


    final CustomerServiceimpl service;

    @PostMapping("/create/customer")
    public void createCustomer(Customer customer){
        log.info(customer.toString());
        service.createCustomer(customer);
    }

    @GetMapping("/get/customer")
    public Iterable<CustomerEntity> getCustomer(){
        return service.getCustomer();
    }
}
