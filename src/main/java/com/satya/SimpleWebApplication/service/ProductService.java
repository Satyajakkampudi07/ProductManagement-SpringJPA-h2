package com.satya.SimpleWebApplication.service;

import com.satya.SimpleWebApplication.Repo.ProductRepo;
import com.satya.SimpleWebApplication.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductsById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }






    /*
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Bag", 2000),
            new Product(103, "Laptop", 70000)
    ));

    // Method to retrieve all products
    public List<Product> getProducts() {
        return products;
    }

    // Method to retrieve a product by its ID
    public Product getProductsById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElse(new Product(100, "No Item", 0));
    }

    // Method to add a new product to the list
    public void addProduct(Product prod) {
        products.add(prod);
    }

    // Method to update an existing product
    public void updateProduct(Product prod) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                products.set(i, prod);
                return;  // Return early after updating
            }
        }
    }

    // Method to delete a product by its ID
    public void deleteProduct(int prodId) {
        products.removeIf(p -> p.getProdId() == prodId);  // Use removeIf to simplify
    }*/
}
