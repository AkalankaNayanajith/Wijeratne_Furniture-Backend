//Call to DB and has connection with DB

package com.wijeratnefurniture.ecomfurniture.repository;

import com.wijeratnefurniture.ecomfurniture.entity.Supplier;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, String> {

// Get all
// Get By id

// Get By name

// find a supplier
Optional<Supplier> findByCompanyName(String companyName);
Optional<Supplier> findByFirstName(String firstName);
Optional<Supplier> findByLastName(String lastName);

}
