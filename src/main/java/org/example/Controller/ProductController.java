package org.example.Controller;

import org.example.Model.Product;
import org.example.Services.ProductServiceimpl;
import org.example.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductServiceimpl service;

    @PostMapping("/product/create")
    void createProduct(@RequestBody Product product){
        service.createProduct(product);
    }

    @GetMapping("/product/all")
    Iterable<ProductEntity> getProduct(){
        return service.getProduct();
    }
}
