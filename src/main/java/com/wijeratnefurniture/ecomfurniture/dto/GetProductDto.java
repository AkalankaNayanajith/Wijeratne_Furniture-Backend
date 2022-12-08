package com.wijeratnefurniture.ecomfurniture.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GetProductDto {
    private String id;
    private String newprodname;
    private String category;
    private String description;
    private int quantity;
    private float discount;
    private float price;
    private String color;
    private String material;
    private String country;
    private String imgpath;
    private String image64; 
}

