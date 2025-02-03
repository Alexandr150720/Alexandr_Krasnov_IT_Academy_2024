package com.academy.course.lesson17.home.project.reader;

import com.academy.course.lesson17.home.project.model.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ProductWriter implements Writer<Product>{

    private String path;

    public ProductWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(Product product) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))){
            writer.write(convertToString(product));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeAll(List<Product> products) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path, false))) {
            for (Product product: products){
                writer.write(convertToString(product));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String convertToString(Product product){
        return product.getId() + ";" + product.getName() + ";" + product.getCreatedAt().toString() + "\n";
    }
}
