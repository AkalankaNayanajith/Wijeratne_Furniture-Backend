package com.wijeratnefurniture.ecomfurniture.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Document(collection = "categories")

public class Category {

    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";
    @Id
    private int id;
    private int seq;
}