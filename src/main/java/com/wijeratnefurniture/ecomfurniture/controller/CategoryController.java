package com.wijeratnefurniture.ecomfurniture.controller;

import com.wijeratnefurniture.ecomfurniture.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping("")
    public String saveCategory(){


        return "jfbvhjefhbvhfe";
    }


}
