
package com.wijeratnefurniture.ecomfurniture.repository;

import com.wijeratnefurniture.ecomfurniture.entity.Customer;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

Optional<Customer> findByEmail(final String email);

}
