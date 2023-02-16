package com.wijeratnefurniture.ecomfurniture.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class CreateSupplierDto {

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
