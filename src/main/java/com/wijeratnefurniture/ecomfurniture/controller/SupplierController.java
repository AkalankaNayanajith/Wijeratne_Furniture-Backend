//
package com.wijeratnefurniture.ecomfurniture.controller;


import com.wijeratnefurniture.ecomfurniture.dto.CreateSupplierDto;
import com.wijeratnefurniture.ecomfurniture.dto.DeleteSupplierDto;
import com.wijeratnefurniture.ecomfurniture.dto.GetSupplierDto;
import com.wijeratnefurniture.ecomfurniture.dto.UpdateSupplierDto;
import com.wijeratnefurniture.ecomfurniture.entity.Supplier;
import com.wijeratnefurniture.ecomfurniture.service.SupplierService;

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
@RequestMapping( value = "/supplier")
@CrossOrigin

public class SupplierController {

    private static final String APPLICATION_JSON_VALUE = null;
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/add")
    public ResponseEntity<Optional<Supplier>> saveSupplier(@RequestBody CreateSupplierDto supplierDto) {
        return new ResponseEntity<>(supplierService.saveSupplier(supplierDto), HttpStatus.CREATED);
    }    

    // cmd -> mongod

    @GetMapping("/getAll")
    public ResponseEntity<Iterable<Supplier>> allSuppliers() {

        return new ResponseEntity<>(supplierService.allSuppliers(), HttpStatus.ACCEPTED);
    }
    
    // @GetMapping( value = "/findOne/{firstName}" ) 
    // public Supplier FindaProduct(@PathVariable String prodName){
    //     return supplierService.FindAProduct(prodName);
    // }

    // @PutMapping("/update")
    // public ResponseEntity<Product> updateSupplier(@RequestBody UpdateProductDto productDataInfo) {
    //     return new ResponseEntity<>(this.productService.updateProductById(productDataInfo), HttpStatus.CREATED);
    // }

    // @DeleteMapping("/delete")
    // public ResponseEntity<Boolean> removeProduct(@RequestBody DeleteProductDto productId) {
    //     return new ResponseEntity<>(this.productService.removeProductById(productId), HttpStatus.ACCEPTED);
    // }

    // @DeleteMapping("/delete/{id}")
    // public boolean DeleteaSupplier(@PathVariable String id){
    //     return supplierService.removeSupplierById(id);
    // }

    // @PostMapping("delete")
    // public ResponseEntity<Boolean> removeCourseCategory(@RequestBody GetProductDto categoryName) {
    //     System.out.println("Hello");
    //     System.out.println(categoryName.getCategoryName());
    //     return new ResponseEntity<>(productService.removeProductById(categoryName), HttpStatus.ACCEPTED);
    // }

}
