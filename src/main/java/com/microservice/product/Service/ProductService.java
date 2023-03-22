package com.microservice.product.Service;

import com.microservice.product.Entity.Product;
import com.microservice.product.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;
    public List<Product> addProdcuts(List<Product> productList) {
        return   productRepo.saveAll(productList);
    }

    public List<Product> getProductrs() {
        return productRepo.findAll();
    }

    public List<Product> getProductsByIds(List<Long> productIdsList) {
        return productRepo.findAllById(productIdsList);
    }
}
