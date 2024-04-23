package com.example.Product_API.repository.ProductRepository;

import com.example.Product_API.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
public interface ProductRepository extends MongoRepository<Product , String> {
    List<Product> findByName(String Name);

}
