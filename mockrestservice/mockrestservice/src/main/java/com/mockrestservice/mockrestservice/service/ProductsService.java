package com.mockrestservice.mockrestservice.service;

import com.mockrestservice.mockrestservice.domain.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsService {

    public static List<Product>  data = null;

    public List<Product> getProducts(){

       if(data==null){
           data = new ArrayList<>();
           for (int i = 0; i <500 ; i++) {
               Product product = Product.builder()
                       .description("desciption"+i)
                       .id(i)
                       .name("name"+i)
                       .price(500+i)
                       .build();
               data.add(product);

           }
       }


        return data;


    }
}
