
package com.wijeratnefurniture.ecomfurniture.service.implementation;

import com.wijeratnefurniture.ecomfurniture.dto.CreateProductDto;
import com.wijeratnefurniture.ecomfurniture.dto.DeleteProductDto;
import com.wijeratnefurniture.ecomfurniture.dto.GetProductDto;
import com.wijeratnefurniture.ecomfurniture.dto.UpdateProductDto;
import com.wijeratnefurniture.ecomfurniture.entity.Product;
import com.wijeratnefurniture.ecomfurniture.repository.ProductRepository;
import com.wijeratnefurniture.ecomfurniture.service.ProductService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.net.HttpRetryException;
import java.util.List;
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
        product.setImage64(productDto.getImage64());
        product.setImages64(productDto.getImages64());

        return Optional.of(productRepository.save(product)); // automatically returns the saved object
        // returns Product object with id

        // save -> without id
        // save -> with id
    }

    @Override
    public Iterable<Product> allProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product FindAProduct(String newprodname){
         Optional<Product> existingProduct = null;
        try {
            existingProduct = productRepository.findByNewprodname(newprodname);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception in Find a Product Service");
        }
        return existingProduct.get();
    }

    @Override
    public Optional<Product> getProductByProductName(GetProductDto productName) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Optional<Product> getProductById(String id) {
        Optional<Product> existingProduct = null;
        existingProduct = productRepository.findById(id);
        if(existingProduct.isPresent()
        ){ return existingProduct;}
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Product Not found");
        }
    }

    // @Override
    // public Iterable<Product> getAllProductsSortedByName() {
    //     return productRepository.findAll(Sort.by(Direction.ASC, "newprodname"));
    // }

    // @Override
    // public Iterable<Product> getAllProductsSortedByPrice() {
    //     return productRepository.findAll(Sort.by(Sort.Direction.DESC, "price"));
    // }

    @Override
    public Boolean updateProductById(UpdateProductDto productInfo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean removeProductById(String id) {
        // TODO Auto-generated method stub
        boolean response = false;
        try {
            Optional<Product> product = productRepository.findByProdid(id);
            productRepository.delete(product.get());
            response = true;
        } catch (Exception e) {
            // TODO: handle exception
        } 
        return response;
    }

    // @Override
    // public Boolean removeProductById(GetProductDto courseCategory) {
    //     System.out.println(courseCategory.getCategoryName());


    //     Optional<Product> foundCourseCategory = this.productRepository.findByName(courseCategory.getCategoryName());
    //     if(foundCourseCategory.isEmpty()) {
    //         return false;
    //     }
    //     System.out.println(foundCourseCategory.get());
    //     this.courseCategoryRepo.delete(foundCourseCategory.get());
    //     return true;
    // }

}
