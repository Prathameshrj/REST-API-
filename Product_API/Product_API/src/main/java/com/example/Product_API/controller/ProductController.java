package com.example.Product_API.controller;

import com.example.Product_API.model.Product;
import com.example.Product_API.service.ProductService;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Products")
@AllArgsConstructor
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getallProduct(){
        return productService.findAllproducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/{customerId}")
    public Product getProduct(@PathVariable String productId)  {
        return productService.getCustomerByproductId(productId);
    }

    @GetMapping("/name/{name}")
    public List<Product> findProductUsingName(@PathVariable String name) {
        return  productService.getProductByName(name);
    }

    @PutMapping
    public Product modifyProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable String productId){
        return productService.deleteProduct(productId);
    }



}

