package com.academy.course.lesson17.home.project.repository;

import com.academy.course.lesson17.home.project.model.Product;
import com.academy.course.lesson17.home.project.reader.Reader;
import com.academy.course.lesson17.home.project.reader.Writer;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class FileProductRepository implements Repository<Product, Integer> {

    private Reader<Product> reader;
    private Writer<Product> writer;

    public FileProductRepository(Writer<Product> writer, Reader<Product> reader) {
        this.writer = writer;
        this.reader = reader;
    }

    @Override
    public boolean create(Product product) {
        try{
            List<Product> products = this.reader.read();
            int id = 0;
            if (!products.isEmpty()) {
                id = products.getLast().getId();
            }
            product.setId(id + 1);
            product.setCreatedAt(LocalDate.now());
            writer.write(product);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public Product read(Integer id) {
        Optional<Product> optionalProduct = reader.read().stream()
                .filter(product -> product.getId() == id)
                .findFirst();

        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }
        throw new RuntimeException();
    }

    @Override
    public boolean delete(Integer id) {
        List<Product> products = this.reader.read();
        List<Product> filteredProduct = products.stream()
                .filter(prod -> prod.getId() != id)
                .toList();

        try {
            if (products.size() != filteredProduct.size()) {
                writer.writeAll(filteredProduct);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public List<Product> readAll() {
        return reader.read();
    }
}
