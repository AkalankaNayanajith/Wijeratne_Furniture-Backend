package com.wijeratnefurniture.ecomfurniture.service.implementation;

import com.wijeratnefurniture.ecomfurniture.dto.CreateSupplierDto;
import com.wijeratnefurniture.ecomfurniture.dto.GetSupplierDto;
import com.wijeratnefurniture.ecomfurniture.dto.UpdateSupplierDto;
import com.wijeratnefurniture.ecomfurniture.entity.Supplier;
import com.wijeratnefurniture.ecomfurniture.repository.SupplierRepository;
import com.wijeratnefurniture.ecomfurniture.service.SupplierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository; 

    @Override
    public Optional<Supplier> saveSupplier(CreateSupplierDto supplierDto) {
        
        Optional<Supplier> foundSupplier = supplierRepository.findByFirstName(supplierDto.getFirstName());

        if(foundSupplier.isPresent()) {
         
            return Optional.empty();
          
        }
        

        Supplier supplier = new Supplier();
        
        supplier.setFirstName(supplierDto.getFirstName());
        supplier.setLastName(supplierDto.getLastName());
        supplier.setCompanyName(supplierDto.getCompanyName());
        supplier.setAddress(supplierDto.getAddress());
        supplier.setNIC(supplierDto.getNIC());
        supplier.setEmail(supplierDto.getEmail());
        supplier.setPassword(supplierDto.getPassword());
        supplier.setPhoto(supplierDto.getPhoto());
        supplier.setMobilePhonenumber(supplierDto.getMobilePhonenumber());
        supplier.setLandLinePhonenumber(supplierDto.getLandLinePhonenumber());
        supplier.setDescription(supplierDto.getDescription());
        supplier.setSupplyItemsList(supplierDto.getSupplyItemsList());

        return Optional.of(supplierRepository.save(supplier)); 
        
    }

    @Override
    public Iterable<Supplier> allSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public Optional<Supplier> getSupplierBySupplierName(GetSupplierDto firstName) {
      
        return Optional.empty();
    }

    @Override
    public Optional<Supplier> getSupplierById(String id) {
       
        return Optional.empty();
    }

    @Override
    public Optional<Supplier> getSupplierByCompanyName(GetSupplierDto companyName) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Boolean updateSupplierBySupplierId(UpdateSupplierDto supplierInfo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean removeSupplierBySupplierId(String id) {
        boolean response = false;
        try {
            Optional<Supplier> supplier = supplierRepository.findById(id);
            supplierRepository.delete(supplier.get());
            response = true;
        } catch (Exception e) {
          
        } 
        return response;
    }

}
