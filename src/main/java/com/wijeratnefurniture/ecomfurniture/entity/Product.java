package com.wijeratnefurniture.ecomfurniture.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Product {
    @Id
    private String id;
    private String product_name;
    private String product_color;
    private String category;
    private int market_price;
    private int discount;
    private int product_price;
    private String product_description;
    private String product_country;
    private String product_material;


}
