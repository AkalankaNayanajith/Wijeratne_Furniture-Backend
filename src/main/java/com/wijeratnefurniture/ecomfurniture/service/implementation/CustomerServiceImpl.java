package com.wijeratnefurniture.ecomfurniture.service.implementation;

import com.wijeratnefurniture.ecomfurniture.dto.CartRowDto;
import com.wijeratnefurniture.ecomfurniture.dto.CreateCustomerDto;
import com.wijeratnefurniture.ecomfurniture.dto.GetCustomerDto;
import com.wijeratnefurniture.ecomfurniture.entity.Customer;
import com.wijeratnefurniture.ecomfurniture.repository.CustomerRepository;
import com.wijeratnefurniture.ecomfurniture.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository; 
    @Override
    public Optional<Customer> saveCustomer(CreateCustomerDto CustomerDto) {

        Optional<Customer> foundCustomer = customerRepository.findByEmail(CustomerDto.getEmail());

        if(foundCustomer.isPresent()) {

            return Optional.empty();
        }


        Customer customer = new Customer();

        customer.setFirstName(CustomerDto.getFirstName());
        customer.setLastName(CustomerDto.getLastName());
        customer.setAddress(CustomerDto.getAddress());
        // customer.setRole(CustomerDto.getRole());
        customer.setEmail(CustomerDto.getEmail());
        customer.setPassword(CustomerDto.getPassword());
        customer.setProfilepic(CustomerDto.getProfilepic());
        customer.setPhonenumber(CustomerDto.getPhonenumber());
        

        return Optional.of(customerRepository.save(customer)); 
    }

    @Override
    public Iterable<Customer> allCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(String id) {
        Optional<Customer> existingCustomer = null;
        existingCustomer = customerRepository.findById(id);
        if(existingCustomer.isPresent()
        ){ return existingCustomer;}
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Customer Not found");
        }
    }

    @Override
    public Optional<Customer> getCustomerByEmail(String email) {
        Optional<Customer> existingCustomer = null;
        existingCustomer = customerRepository.findByEmail(email);
        if(existingCustomer.isPresent()
        ){ return existingCustomer;}
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Customer Not found");
        }
    }

    @Override
    boolean SaveCart(CartRowDto cardrowdto){
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }

}
