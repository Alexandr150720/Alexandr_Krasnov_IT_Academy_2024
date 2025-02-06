package com.academy.course.lesson17.home.project.view;

import java.util.Scanner;

public class OrderCollectionView implements View{

    View productView;
    View orderView;

    public OrderCollectionView(View productView, View orderView) {
        this.productView = productView;
        this.orderView = orderView;
    }

    @Override
    public void start() {
        while (true) {
            System.out.println("== Order collection ==");
            System.out.println("Для работы с продуктами введите 1");
            System.out.println("Для работы с заказами введите 2");
            System.out.println("Для выхода введите 3");

            Scanner scanner = new Scanner(System.in);
            String pressedButton = scanner.nextLine();

            switch (pressedButton) {
                case "1":
                    productView.start();
                    break;
                case "2":
                    orderView.start();
                    break;
                case "3":
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
            }

        }
    }
}
