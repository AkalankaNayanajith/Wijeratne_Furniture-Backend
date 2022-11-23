//what we want from frontend.... here we dont want ID and we want everything else about a product
package com.wijeratnefurniture.ecomfurniture.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class CreateProductDto {
    
    private String prodid; //we give ID manually

    private String name;

    private String category;

    private String description;

    private float market_price;

    private float discount;

    private float price;

    private String color;

    private String material;

    private String country;
}