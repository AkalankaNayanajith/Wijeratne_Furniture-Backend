package com.wijeratnefurniture.ecomfurniture.service;

import com.wijeratnefurniture.ecomfurniture.dto.CreateSupplierDto;
import com.wijeratnefurniture.ecomfurniture.dto.GetSupplierDto;
import com.wijeratnefurniture.ecomfurniture.dto.UpdateSupplierDto;
import com.wijeratnefurniture.ecomfurniture.entity.Supplier;

import java.util.Optional;

public interface SupplierService {

    Optional<Supplier> saveSupplier(final CreateSupplierDto supplier);
 

   Iterable<Supplier> allSuppliers();

   Optional<Supplier> getSupplierBySupplierName(final GetSupplierDto firstName);

   Optional<Supplier> getSupplierByCompanyName(final GetSupplierDto companyName);

   Optional<Supplier> getSupplierById(final String id);

   Boolean updateSupplierBySupplierId(final UpdateSupplierDto supplierInfo);

   Boolean removeSupplierBySupplierId(String id);

}
