package org.example.Services;

import lombok.RequiredArgsConstructor;
import org.example.Model.Customer;
import org.example.Repository.CustomerRepository;
import org.example.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class CustomerServiceimpl {


    final CustomerRepository repository;

    public void createCustomer(@RequestBody Customer customer){
        CustomerEntity entity = new CustomerEntity();
        entity.setFullName(customer.getFullName());
        entity.setAge(customer.getAge());
        entity.setAddress(customer.getAddress());
        entity.setEmail(customer.getEmail());
        entity.setPhoneNumber(customer.getPhoneNumber());

        repository.save(entity);
    }

    public Iterable<CustomerEntity> getCustomer(){
        return repository.findAll();
    }

}
