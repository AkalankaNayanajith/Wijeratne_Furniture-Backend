package com.wijeratnefurniture.ecomfurniture.service;

import com.wijeratnefurniture.ecomfurniture.dto.CreateProductDto;
import com.wijeratnefurniture.ecomfurniture.dto.DeleteProductDto;
import com.wijeratnefurniture.ecomfurniture.dto.GetProductDto;
import com.wijeratnefurniture.ecomfurniture.dto.UpdateProductDto;
import com.wijeratnefurniture.ecomfurniture.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    // Prototype

    Optional<Product> saveProduct(final CreateProductDto product);
    // Return Type -> method Name -> What are the parameters
 

   Iterable<Product> allProducts();

   Optional<Product> getProductByProductName(final GetProductDto productName);

   Optional<Product> getProductById(final String id);

   Boolean updateProductById(final UpdateProductDto productInfo);

   Boolean removeProductById(String id);

   Product FindAProduct(String newProdName);

   
//    Iterable<Product> getAllProductsSortedByName();

//    Iterable<Product> getAllProductsSortedByPrice();

}
