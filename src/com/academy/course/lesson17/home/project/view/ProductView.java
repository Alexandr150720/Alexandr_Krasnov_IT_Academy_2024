package com.academy.course.lesson17.home.project.view;

import com.academy.course.lesson17.home.project.model.Product;
import com.academy.course.lesson17.home.project.service.Service;

import java.util.List;
import java.util.Scanner;

public class ProductView implements View{

    Service<Product, Integer> productService;

    public ProductView(Service<Product, Integer> productService) {
        this.productService = productService;
    }

    @Override
    public void start() {
        while (true) {
            System.out.println("== Продукты ==");
            System.out.println("Для создания продукта введите 1");
            System.out.println("Для удаления продукта введите 2");
            System.out.println("Для просмотра списка продуктов введите 3");
            System.out.println("Для выхода нажмите 4");

            Scanner scanner = new Scanner(System.in);
            String pressedButton = scanner.nextLine();

            switch (pressedButton) {
                case "1":
                    System.out.println("Введите название продукта: ");
                    String productName = scanner.nextLine();
                    Product newProduct = new Product(productName);

                    boolean isCreated = productService.create(newProduct);
                    if(isCreated) System.out.println("Товар добавлен!!\n");
                    else System.out.println("Ошибка при создании продукта");

                    break;
                case "2":
                    System.out.println("Введите id удаляемого продукта: ");
                    Integer productId = scanner.nextInt();
                    productService.delete(productId);
                    break;
                case "3":
                    List<Product> productList = productService.readAll();
                    for(Product product: productList){
                        System.out.println(product);
                    }
                    break;
                case "4":
                    System.out.println("Выход из программы.");
                    return;
            }
        }
    }
}
