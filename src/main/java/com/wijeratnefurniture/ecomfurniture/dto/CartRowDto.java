
package com.wijeratnefurniture.ecomfurniture.dto;

import com.wijeratnefurniture.ecomfurniture.entity.Product;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CartRowDto {
    private Product prodid; 
    private String Variant; 
    private int quanity;
    private String email;

    
}
