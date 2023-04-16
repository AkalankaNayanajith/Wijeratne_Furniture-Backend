package com.wijeratnefurniture.ecomfurniture.entity;

import lombok.*;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

class CartRow{
    private int quantity;
    private Product product;
    private String variant;
}

@Document 
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Cart {
    @Id  //id is autogenerated
    private String cartID;
    // @DBRef 
    // private User user;
    @DBRef
    private List<CartRow> cartRows; 

}