package com.academy.course.lesson17.home.project;

import com.academy.course.lesson17.home.project.model.Order;
import com.academy.course.lesson17.home.project.model.Product;
import com.academy.course.lesson17.home.project.reader.*;
import com.academy.course.lesson17.home.project.repository.FileOrderRepository;
import com.academy.course.lesson17.home.project.repository.FileProductRepository;
import com.academy.course.lesson17.home.project.repository.Repository;
import com.academy.course.lesson17.home.project.service.OrderService;
import com.academy.course.lesson17.home.project.service.ProductService;
import com.academy.course.lesson17.home.project.service.Service;
import com.academy.course.lesson17.home.project.view.OrderCollectionView;
import com.academy.course.lesson17.home.project.view.OrderView;
import com.academy.course.lesson17.home.project.view.ProductView;
import com.academy.course.lesson17.home.project.view.View;

public class Main {

    public static void main(String[] args) {

        String pathToProductFile = "D:\\Wolf\\Different\\IDEA\\Project\\files\\products.txt";
        String pathToOrderFile = "D:\\Wolf\\Different\\IDEA\\Project\\files\\orders.txt";

        Reader<Product> productReader = new ProductReader(pathToProductFile);
        Writer<Product> productWriter = new ProductWriter(pathToProductFile);

        Reader<Order> orderReader = new OrderReader(pathToOrderFile);
        Writer<Order> orderWriter = new OrderWriter(pathToOrderFile);


        Repository<Product, Integer> productRepository = new FileProductRepository(productWriter, productReader);
        Repository<Order, Integer> orderRepository = new FileOrderRepository(orderWriter, orderReader);

        Service<Product, Integer> productService = new ProductService(productRepository);
        Service<Order, Integer> orderService = new OrderService(orderRepository);

        View productView = new ProductView(productService);
        View orderView = new OrderView(orderService, productService);

        View orderCollectionView = new OrderCollectionView(productView, orderView);

        orderCollectionView.start();
    }


}
