package com.academy.course.lesson17.home.project.repository;

import com.academy.course.lesson17.home.project.model.Order;
import com.academy.course.lesson17.home.project.reader.Reader;
import com.academy.course.lesson17.home.project.reader.Writer;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class FileOrderRepository implements Repository<Order, Integer> {

    private Reader<Order> reader;
    private Writer<Order> writer;

    public FileOrderRepository(Writer<Order> writer, Reader<Order> reader) {
        this.writer = writer;
        this.reader = reader;
    }

    @Override
    public boolean create(Order order) {
        try{
            List<Order> orders = this.reader.read();
            int id = 0;
            if (!orders.isEmpty()){
                id = orders.getLast().getId();
            }
            order.setId(id + 1);
            order.setCreatedAt(LocalDate.now());
            writer.write(order);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public Order read(Integer id) {
        Optional<Order> optionalOrder = reader.read().stream()
                .filter(product -> product.getId() == id)
                .findFirst();

        if(optionalOrder.isPresent()){
            return optionalOrder.get();
        }
        throw new RuntimeException();
    }

    @Override
    public boolean delete(Integer id) {
        List<Order> orders = this.reader.read();
        List<Order> filteredOrder = orders.stream()
                .filter(order -> order.getId() != id)
                .toList();

        try {
            if (orders.size() != filteredOrder.size()) {
                writer.writeAll(filteredOrder);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public List<Order> readAll() {
        return reader.read();
    }
}
