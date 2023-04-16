package com.wijeratnefurniture.ecomfurniture.service;

import com.wijeratnefurniture.ecomfurniture.dto.CartRowDto;
import com.wijeratnefurniture.ecomfurniture.dto.CreateCustomerDto;
import com.wijeratnefurniture.ecomfurniture.dto.GetCustomerDto;
import com.wijeratnefurniture.ecomfurniture.entity.Customer;

import java.util.Optional;

public interface CustomerService {

    Optional<Customer> saveCustomer(final CreateCustomerDto customer);

    Iterable<Customer> allCustomers();

    Optional<Customer> getCustomerById(final String id);

    Optional<Customer> getCustomerByEmail(final String email);

    boolean SaveCart(CartRowDto cardrowdto);
 
}