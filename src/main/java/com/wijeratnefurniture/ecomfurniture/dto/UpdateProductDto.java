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
