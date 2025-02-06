package com.academy.course.lesson17.home.project.service;

import com.academy.course.lesson17.home.project.model.Product;
import com.academy.course.lesson17.home.project.repository.Repository;

import java.util.List;

public class ProductService implements Service<Product, Integer>{

    Repository<Product, Integer> productRepository;

    public ProductService(Repository<Product, Integer> productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public boolean create(Product product) {
       return productRepository.create(product);
    }

    @Override
    public Product read(Integer id) {
        return productRepository.read(id);
    }

    @Override
    public boolean delete(Integer id) {
        return productRepository.delete(id);
    }

    @Override
    public List<Product> readAll() {
        return productRepository.readAll();
    }
}
