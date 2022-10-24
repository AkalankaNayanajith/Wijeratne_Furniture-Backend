package com.wijeratnefurniture.ecomfurniture.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document // -> MongoDB
//@Entity() // ->mysql
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Product {
    @Id //@Id annotation to pass data to MongoDB  //id is autogenerated
    private String id;  //we use id just after @Id annotation to say that this is the primary key

    private String name;  //all these below are attributes of the product entity

    private String category;

    private String description;
    //product image to be added
    private float market_price;

    private float discount;

    private float price;

    private String color;

    private String material;

    private String country;

}
