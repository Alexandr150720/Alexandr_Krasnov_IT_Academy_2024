package com.academy.course.lesson17.home.project.model;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private int id;
    private List<Integer> products;
    private LocalDate createdAt;

    public Order(List<Integer> products) {
        this.products = products;
    }

    public Order(int id, List<Integer> products, LocalDate createdAt) {
        this.id = id;
        this.products = products;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getProducts() {
        return products;
    }

    public void setProducts(List<Integer> products) {
        this.products = products;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                ", createdAt=" + createdAt +
                '}';
    }
}
