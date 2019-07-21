package com.mockrestservice.mockrestservice.resource;


import com.mockrestservice.mockrestservice.domain.Product;
import com.mockrestservice.mockrestservice.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class productsResouce {

    private final ProductsService productsService;

    @Autowired
    public productsResouce(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/products")
    public List<Product> retrieveAllProducts(){
        return productsService.getProducts();
    }
}
