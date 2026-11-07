package org.example.Controller;

import org.example.Model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @PostMapping("/create-product") //post request ekak ena nisa
    public void createProduct(@RequestBody Product product){  //reqiestBody eken kiyanne json type eke eva mapp karanna kiyala meke object ekata
        System.out.println(product);
    }

    @GetMapping("/get-product")
    List<Product> getProducts(){
        return null;
    }


}
