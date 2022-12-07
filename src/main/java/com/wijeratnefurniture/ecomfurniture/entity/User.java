package com.wijeratnefurniture.ecomfurniture.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document // -> MongoDB
//@Entity() // ->mysql
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {
    

    @Id //@Id annotation to pass data to MongoDB  //id is autogenerated
    private String id;  //we use id just after @Id annotation to say that this is the primary key

    private String userid; //we give ID manually
    private String firstName; //all these below are attributes of the user entity
    private String lastName; 
    private String address; 
    private String gender; 
    private String NIC;
    private String role;
    private String email;      
    private String password;
// image to be added
    private float age;
    private String DOB;
    private String profilepic; 
    private int phonenumber;

}
