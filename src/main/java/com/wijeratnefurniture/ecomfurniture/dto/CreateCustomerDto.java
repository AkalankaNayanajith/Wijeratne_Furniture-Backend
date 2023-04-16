
package com.wijeratnefurniture.ecomfurniture.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class CreateCustomerDto {
 
    private String firstName; 
    private String lastName; 
    private String address; 
    // private String role;
    private String email;      
    private String password;
    private String profilepic;
    private int phonenumber;

    
}