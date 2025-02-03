package com.academy.course.lesson17.home.project.service;

import com.academy.course.lesson17.home.project.model.Order;
import com.academy.course.lesson17.home.project.repository.Repository;

import java.util.List;

public class OrderService implements Service<Order, Integer>{

    Repository<Order, Integer> orderRepository;

    public OrderService(Repository<Order, Integer> orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean create(Order order) {
       return orderRepository.create(order);
    }

    @Override
    public Order read(Integer id) {
        return orderRepository.read(id);
    }

    @Override
    public boolean delete(Integer id) {
        return orderRepository.delete(id);
    }

    @Override
    public List<Order> readAll() {
        return orderRepository.readAll();
    }
}
