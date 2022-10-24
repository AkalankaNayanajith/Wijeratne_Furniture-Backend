//Call to DB and has connection with DB

package com.wijeratnefurniture.ecomfurniture.repository;

import com.wijeratnefurniture.ecomfurniture.entity.Product;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

// Get all
// Get By id

// Get By name
Optional<Product> findByName(final String name);

}
