package com.academy.course.lesson17.home.project.reader;

import com.academy.course.lesson17.home.project.model.Order;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrderReader implements Reader<Order>{

    private String path;

    public OrderReader(String path) {
        this.path = path;
    }

    @Override
    public List<Order> read() {
        List<Order> orders = new ArrayList<>();

        try(Scanner scan = new Scanner(new File(path))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] orderString = line.split(";");

                int id = Integer.parseInt(orderString[0]);

                String[] stringProductIds = orderString[1].split(",");
                List<Integer> intProductIds = Arrays.stream(stringProductIds)
                        .map(Integer::parseInt)
                        .toList();

                LocalDate createdAt = getDateFromString(orderString[2]);

                orders.add(new Order(id, intProductIds, createdAt));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return orders;
    }

    private LocalDate getDateFromString(String date) {
        String[] productCreateDateString = date.split("-");
        int year = Integer.parseInt(productCreateDateString[0]);
        int month = Integer.parseInt(productCreateDateString[1]);
        int day = Integer.parseInt(productCreateDateString[2]);
        return LocalDate.of(year, month, day);
    }
}
