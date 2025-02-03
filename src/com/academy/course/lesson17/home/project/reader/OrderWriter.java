package com.academy.course.lesson17.home.project.reader;

import com.academy.course.lesson17.home.project.model.Order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OrderWriter implements Writer<Order>{

    private String path;

    public OrderWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(Order order) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))){
            writer.write(convertToString(order));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeAll(List<Order> orders) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path, false))) {
            for (Order order: orders){
                writer.write(convertToString(order));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String convertToString(Order order){
        StringBuilder idString = new StringBuilder();
        for (Integer productId: order.getProducts()){
            idString.append(productId).append(",");
        }

        return order.getId() + ";" + idString + ";" + order.getCreatedAt().toString() + "\n";
    }
}
