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

public class Customer {

    @Id 
    private String id;  
    private String firstName; 
    private String lastName; 
    private String email;      
    private String password;
    private String address; 
    // private String role;
    private String profilepic; 
    private int phonenumber;
    
}
