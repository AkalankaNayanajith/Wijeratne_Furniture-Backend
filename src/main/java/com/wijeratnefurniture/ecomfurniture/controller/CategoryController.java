package com.wijeratnefurniture.ecomfurniture.controller;

import com.wijeratnefurniture.ecomfurniture.dto.CreateCategoryDto;
import com.wijeratnefurniture.ecomfurniture.entity.Category;
import com.wijeratnefurniture.ecomfurniture.service.CategoryService;
import com.wijeratnefurniture.ecomfurniture.service.ProductService;
import com.wijeratnefurniture.ecomfurniture.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.wijeratnefurniture.ecomfurniture.entity.Category.*;



@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping

public class CategoryController {    

    @Autowired
    private CategoryRepository repository;

    @Autowired
    public CategoryService service;

    @PostMapping("/saveCategory")
    public Category save(@RequestBody Category category){
        category.setId(service.getSequenceNumber(SEQUENCE_NAME));
            return repository.save(category);
    }

    @GetMapping("/category")
    public List<Category> getCategories(){
        return repository.findAll();
    }

    @GetMapping("/category/{id}")
    public Optional<Category> getCategories(@PathVariable Integer id){
        return repository.findById(id);
    }



}