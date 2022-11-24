
package com.wijeratnefurniture.ecomfurniture.service.implementation;

import com.wijeratnefurniture.ecomfurniture.dto.CreateProductDto;
import com.wijeratnefurniture.ecomfurniture.entity.Product;
import com.wijeratnefurniture.ecomfurniture.repository.ProductRepository;
import com.wijeratnefurniture.ecomfurniture.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository; //call to repository because it work with DB

    @Override
    public Optional<Product> saveProduct(CreateProductDto productDto) {
        // id missing

        // Validation
        // Sofa MX-98
        Optional<Product> foundProduct = productRepository.findByNewprodname(productDto.getNewprodname());

        if(foundProduct.isPresent()) {

            // Stop
            return Optional.empty();
            // eliminate the process
        }

        // Converting

        Product product = new Product();
        
        product.setProdid(productDto.getProdid());
        product.setNewprodname(productDto.getNewprodname());
        product.setCategory(productDto.getCategory());
        product.setDescription(productDto.getDescription());
        product.setQuantity(productDto.getQuantity());
        product.setDiscount(productDto.getDiscount());
        product.setPrice(productDto.getPrice());
        product.setColor(productDto.getColor());
        product.setMaterial(productDto.getMaterial());
        product.setCountry(productDto.getCountry());

        return Optional.of(productRepository.save(product)); // automatically returns the saved object
        // returns Product object with id

        // save -> without id
        // save -> with id
    }
}
