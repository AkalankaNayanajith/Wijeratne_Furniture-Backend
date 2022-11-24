
package com.wijeratnefurniture.ecomfurniture.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class CreateUserDto {

   
    private String firstName; 
    private String lastName; 
    private String address; 
    private String gender; 
    private String NIC;
    private String role;
    private String userName;      
    private String password;
// image to be added
    private float age;
    private String DOB;

    
}