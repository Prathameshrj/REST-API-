package com.example.Product_API.service;



import com.example.Product_API.model.Product;
import com.example.Product_API.repository.ProductRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ProductService {
   @Autowired
    private ProductRepository repository;

    //CRUD
    public Product addProduct(Product product){
        product.setProductId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(product);
    }

    public List<Product> findAllproducts(){
        return repository.findAll();
    }

    public Product getCustomerByproductId(String productId)  {
        return repository.findById(productId).get();
    }

    public List<Product> getProductByName(String name)  {
        return repository.findByName(name);
    }

    public Product updateProduct (Product productRequest){
        return repository.save(productRequest);
    }
    public String deleteProduct(String productId){
        repository.deleteById(productId);
        return productId+ "customer details deleted";
    }

}

