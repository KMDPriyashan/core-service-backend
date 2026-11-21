package org.example.Controller;

import org.example.Model.Orders;
import org.example.Services.OrderServiceimpl;
import org.example.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderServiceimpl service;

    @PostMapping("/add-order")
    public void addOrder(@RequestBody Orders orders){
        service.addOrder(orders);
    }

    public Iterable<OrderEntity> allOrders(){
        return service.allOrders();
    }
}
