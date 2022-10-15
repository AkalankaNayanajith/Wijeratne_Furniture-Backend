package com.wijeratnefurniture.ecomfurniture.repo;

import com.wijeratnefurniture.ecomfurniture.entity.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepo extends CrudRepository<Category,String> {

    Optional<Category> findByName(final String name); //"Optional" means there can be or cannot be Category in that name

}
