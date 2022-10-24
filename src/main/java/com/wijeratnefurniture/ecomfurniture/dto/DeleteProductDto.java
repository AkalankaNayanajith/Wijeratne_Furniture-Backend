//what we want from frontend.... here we dont want ID and we want everything else about a product
package com.wijeratnefurniture.ecomfurniture.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class DeleteProductDto {
    private String id;
}