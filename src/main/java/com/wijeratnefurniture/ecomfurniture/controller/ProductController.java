//
package com.wijeratnefurniture.ecomfurniture.controller;


import com.wijeratnefurniture.ecomfurniture.dto.CreateProductDto;
import com.wijeratnefurniture.ecomfurniture.entity.Product;
import com.wijeratnefurniture.ecomfurniture.service.ProductService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("product")
// http://localhost:8080/product
// GET
// POST
// DELETE

//{ "name": "luxury sofa",
// "category":"chairs",
// "description": "cheap affordable sofa",
//"market_price": 75000,
//"discount": 5.2,
//"price": 50000,
//"color": "Red",
//"material": "leather",
// "country": "Sri lanka"}

public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Optional<Product>> saveProduct(@RequestBody CreateProductDto productDto) {
        return new ResponseEntity<>(productService.saveProduct(productDto), HttpStatus.CREATED);
    }    

    // cmd -> mongod

}
