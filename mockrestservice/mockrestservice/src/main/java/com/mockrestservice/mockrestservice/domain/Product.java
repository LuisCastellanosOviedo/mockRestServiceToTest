package com.mockrestservice.mockrestservice.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {


    private String name;
    private String description;
    private int size;
    private  long price;
    private long id;
}
