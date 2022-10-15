package com.wijeratnefurniture.ecomfurniture.service.implementation;

import com.wijeratnefurniture.ecomfurniture.entity.Category;
import com.wijeratnefurniture.ecomfurniture.dto.CreateCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import com.wijeratnefurniture.ecomfurniture.repo.CategoryRepo;
import com.wijeratnefurniture.ecomfurniture.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Optional<Category> saveCategory(CreateCategoryDto categoryInfo) {
        Optional<Category> foundCategory =  categoryRepo.findByName(categoryInfo.getCategoryName());

        if(foundCategory.isPresent()) {
            return Optional.empty();
        }

        Category category = new Category();

        category.setName(categoryInfo.getCategoryName());

        return Optional.of(categoryRepo.save(category));}
}
