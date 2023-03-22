package com.microservice.product.Controller;

import com.microservice.product.Entity.Product;
import com.microservice.product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;


    @PostMapping("/addProducts")
    public List<Product> addProduct(@RequestBody List<Product> productList){
        return productService.addProdcuts(productList);
    }

    @GetMapping("/getProducts")
    public List<Product> getProduct(){
        return productService.getProductrs();
    }

    @GetMapping("/getProducts/{productIdsList}")
    public List<Product> getProductsByIds(@PathVariable List<Long> productIdsList){
        return productService.getProductsByIds(productIdsList);
    }


}
