package com.wijeratnefurniture.ecomfurniture.repository;

import com.wijeratnefurniture.ecomfurniture.entity.User;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

// Get all
// Get By id

// Get By name
Optional<User> findByName(final String name);

}
