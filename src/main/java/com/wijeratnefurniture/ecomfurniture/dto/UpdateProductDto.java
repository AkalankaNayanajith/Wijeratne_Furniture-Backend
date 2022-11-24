package com.wijeratnefurniture.ecomfurniture.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateProductDto {
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
}
