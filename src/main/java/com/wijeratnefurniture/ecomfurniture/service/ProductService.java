package com.wijeratnefurniture.ecomfurniture.service;

import com.wijeratnefurniture.ecomfurniture.dto.CreateProductDto;
import com.wijeratnefurniture.ecomfurniture.entity.Product;

import java.util.Optional;

public interface ProductService {

    // Prototype

    Optional<Product> saveProduct(final CreateProductDto product);
    // Return Type -> method Name -> What are the parameters
 

   Iterable<Product> allProducts();
}
