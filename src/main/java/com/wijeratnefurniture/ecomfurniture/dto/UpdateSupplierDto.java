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
public class UpdateSupplierDto {
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
