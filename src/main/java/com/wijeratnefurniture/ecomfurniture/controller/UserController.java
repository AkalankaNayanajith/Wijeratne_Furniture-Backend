package com.wijeratnefurniture.ecomfurniture.controller;


import com.wijeratnefurniture.ecomfurniture.dto.CreateUserDto;
import com.wijeratnefurniture.ecomfurniture.entity.User;
import com.wijeratnefurniture.ecomfurniture.service.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("user")
// http://localhost:8080/user
// GET
// POST
// DELETE

public class UserController {

    @Autowired
    private UserService UserService;

    @PostMapping
    public ResponseEntity<Optional<User>> saveUser(@RequestBody CreateUserDto userDto) {
        return new ResponseEntity<>(UserService.saveUser(userDto), HttpStatus.CREATED);
    }    


}
