package com.wijeratnefurniture.ecomfurniture.service;

import com.wijeratnefurniture.ecomfurniture.dto.CreateUserDto;
import com.wijeratnefurniture.ecomfurniture.entity.User;

import java.util.Optional;

public interface UserService {

    // Prototype

    Optional<User> saveUser(final CreateUserDto User);
    // Return Type -> method Name -> What are the parameters

}