//
package com.wijeratnefurniture.ecomfurniture.controller;


import com.wijeratnefurniture.ecomfurniture.dto.CreateProductDto;
import com.wijeratnefurniture.ecomfurniture.dto.DeleteProductDto;
import com.wijeratnefurniture.ecomfurniture.dto.GetProductDto;
import com.wijeratnefurniture.ecomfurniture.dto.UpdateProductDto;
import com.wijeratnefurniture.ecomfurniture.entity.Product;
import com.wijeratnefurniture.ecomfurniture.service.ProductService;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping( value = "/product")
@CrossOrigin
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

    private static final String APPLICATION_JSON_VALUE = null;
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<Optional<Product>> saveProduct(@RequestBody CreateProductDto productDto) {
        return new ResponseEntity<>(productService.saveProduct(productDto), HttpStatus.CREATED);
    }    

    // cmd -> mongod

    @GetMapping("/getAll")
    public ResponseEntity<Iterable<Product>> allProducts() {

        return new ResponseEntity<>(productService.allProducts(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable String id){
        return productService.getProductById(id);
    }
    
    // @GetMapping("/sortedByName")
    // public ResponseEntity<Iterable<Product>> getAllProductsSortedByName() {
    //     return new ResponseEntity<>(productService.getAllProductsSortedByName(), HttpStatus.OK);
    // }

    // @GetMapping("/sortedByPrice")
    // public ResponseEntity<Iterable<Product>> getAllProductsSortedByPrice() {
    //     return new ResponseEntity<>(productService.getAllProductsSortedByPrice(), HttpStatus.OK);
    // }
    
    @GetMapping( value = "/findOne/{prodName}" ) 
    public Product FindaProduct(@PathVariable String prodName){
        return productService.FindAProduct(prodName);
    }

    // @PutMapping("/update")
    // public ResponseEntity<Product> updateProduct(@RequestBody UpdateProductDto productDataInfo) {
    //     return new ResponseEntity<>(this.productService.updateProductById(productDataInfo), HttpStatus.CREATED);
    // }

    // @DeleteMapping("/delete")
    // public ResponseEntity<Boolean> removeProduct(@RequestBody DeleteProductDto productId) {
    //     return new ResponseEntity<>(this.productService.removeProductById(productId), HttpStatus.ACCEPTED);
    // }

    @DeleteMapping("/delete/{id}")
    public boolean DeleteaProduct(@PathVariable String id){
        return productService.removeProductById(id);
    }

    // @PostMapping("delete")
    // public ResponseEntity<Boolean> removeCourseCategory(@RequestBody GetProductDto categoryName) {
    //     System.out.println("Hello");
    //     System.out.println(categoryName.getCategoryName());
    //     return new ResponseEntity<>(productService.removeProductById(categoryName), HttpStatus.ACCEPTED);
    // }

}
