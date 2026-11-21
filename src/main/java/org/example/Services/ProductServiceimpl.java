package org.example.Services;

import org.example.Model.Product;
import org.example.Repository.ProductRepository;
import org.example.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductServiceimpl {

    @Autowired
    ProductRepository repository;

    public void createProduct(@RequestBody Product product) {
        ProductEntity entity = new ProductEntity();
        entity.setName(product.getName());
        entity.setDescription(product.getDescription());
        entity.setPrice(product.getPrice());
        entity.setStockCount(product.getStockCount());
        entity.setActive(product.isActive());
        repository.save(entity);

    }

    public Iterable<ProductEntity> getProduct() {
        return repository.findAll();

    }

}