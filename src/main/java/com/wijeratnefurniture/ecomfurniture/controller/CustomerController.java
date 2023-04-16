package com.wijeratnefurniture.ecomfurniture.controller;


import com.wijeratnefurniture.ecomfurniture.dto.CreateCustomerDto;
import com.wijeratnefurniture.ecomfurniture.entity.Customer;
import com.wijeratnefurniture.ecomfurniture.service.CustomerService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("customer")
@CrossOrigin
// http://localhost:8080/customer
// GET
// POST
// DELETE

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity<Optional<Customer>> saveCustomer(@RequestBody CreateCustomerDto customerDto) {
        return new ResponseEntity<>(customerService.saveCustomer(customerDto), HttpStatus.CREATED);
    }    

    @GetMapping("/getAll")
    public ResponseEntity<Iterable<Customer>> allCustomers() {

        return new ResponseEntity<>(customerService.allCustomers(), HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/{id}")
    public Optional<Customer> getCustomer(@PathVariable String id){
        return customerService.getCustomerById(id);
    }

}