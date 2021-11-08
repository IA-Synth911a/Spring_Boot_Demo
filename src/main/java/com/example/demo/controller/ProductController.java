/**
 * Comment
 */

package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    ProductService productManager;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productManager.getProducts();
    
    }
}
