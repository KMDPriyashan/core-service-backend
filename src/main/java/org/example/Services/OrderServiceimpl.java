package org.example.Services;

import org.example.Model.Orders;
import org.example.Repository.CustomerRepository;
import org.example.Repository.OrderRepository;
import org.example.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderServiceimpl {

    @Autowired
    OrderRepository repository;

    public void addOrder(@RequestBody Orders orders){
        OrderEntity entity = new OrderEntity();
        entity.setItemName(orders.getItemName());
        entity.setAmount(orders.getAmount());
        entity.setDate(orders.getDate());

        repository.save(entity);
    }
    public Iterable<OrderEntity> allOrders(){
        return repository.findAll();
    }
}
