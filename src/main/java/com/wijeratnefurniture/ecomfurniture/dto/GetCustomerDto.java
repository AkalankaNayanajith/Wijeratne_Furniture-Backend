package com.wijeratnefurniture.ecomfurniture.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GetCustomerDto {
    private String firstName; 
    private String lastName; 
    private String companyName; 
    private String address; 
    private String NIC;
    private String email;      
    private String password;
    private String photo; 
    private int mobilePhonenumber;
    private int LandLinePhonenumber;
    private String description;
    private String supplyItemsList; 
    
}
