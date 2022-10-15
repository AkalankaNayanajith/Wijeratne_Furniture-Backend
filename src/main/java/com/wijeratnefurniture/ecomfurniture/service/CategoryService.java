package com.wijeratnefurniture.ecomfurniture.service;

import com.wijeratnefurniture.ecomfurniture.entity.Category;
import com.wijeratnefurniture.ecomfurniture.dto.CreateCategoryDto;

import java.util.Optional;

public interface CategoryService {
    Optional<Category> saveCategory(final CreateCategoryDto course);
}
