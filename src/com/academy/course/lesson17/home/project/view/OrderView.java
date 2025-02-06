package com.academy.course.lesson17.home.project.view;

import com.academy.course.lesson17.home.project.model.Order;
import com.academy.course.lesson17.home.project.model.Product;
import com.academy.course.lesson17.home.project.service.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderView implements View{

    Service<Order, Integer> orderService;
    Service<Product, Integer> productService;

    public OrderView(Service<Order, Integer> orderService, Service<Product, Integer> productService) {
        this.orderService = orderService;
        this.productService = productService;
    }

    @Override
    public void start() {
        while (true) {
            System.out.println("== Заказы ==");
            System.out.println("Для создания заказа введите 1");
            System.out.println("Для удаления заказа введите 2");
            //System.out.println("Для изменения продукта введите 3");
            System.out.println("Для просмотра списка заказов введите 3");
            System.out.println("Для выхода нажмите 4");

            Scanner scanner = new Scanner(System.in);
            String pressedButton = scanner.nextLine();

            switch (pressedButton) {
                case "1":
                    List<Product> productList = productService.readAll();
                    for(Product product: productList){
                        System.out.println(product);
                    }

                    List<Integer> products = new ArrayList<>();

                    while (true) {
                        System.out.println("Введите id продукта добавляемого в заказ: ");
                        if(!products.isEmpty()){
                            System.out.println("Введите 0 для выхода в меню заказов");
                        }

                        Integer productId = scanner.nextInt();
                        if(productId == 0){
                            if (!products.isEmpty()){
                                break;
                            }
                            System.out.println("Товара с веденным id не существует");
                        }
                        if(checkProductId(productList, productId)){
                            products.add(productId);
                        }
                    }

                    Order newOrder = new Order(products);
                    orderService.create(newOrder);
                    System.out.println("Товар добавлен!!\n");
                    break;
                case "2":
                    System.out.println("Введите id удаляемого заказа: ");
                    Integer orderId = scanner.nextInt();
                    orderService.delete(orderId);
                    break;
                case "3":
                    List<Order> orders = orderService.readAll();
                    for(Order order: orders){
                        System.out.println(order);
                    }
                    break;
                case "4":
                    System.out.println("Выход из программы.");
                    return;
            }

        }
    }

    private boolean checkProductId(List<Product> products, Integer userProductId){
        for(Product product: products){
            if(product.getId() == userProductId){
                return true;
            }
        }
        System.out.println("Продукта с таким id не существует");
        return false;
    }
}
