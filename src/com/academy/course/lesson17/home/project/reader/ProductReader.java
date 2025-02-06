package com.academy.course.lesson17.home.project.reader;

import com.academy.course.lesson17.home.project.model.Product;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductReader implements Reader<Product>{

    private String path;

    public ProductReader(String path) {
        this.path = path;
    }

    @Override
    public List<Product> read() {
        List<Product> products = new ArrayList<>();

        try(Scanner scan = new Scanner(new File(path))){
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] productString = line.split(";");

                int id = Integer.parseInt(productString[0]);
                String name = productString[1];
                LocalDate createdAt = getDateFromString(productString[2]);

                products.add(new Product(id, name, createdAt));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }

    private LocalDate getDateFromString(String date) {
        String[] productCreateDateString = date.split("-");
        int year = Integer.parseInt(productCreateDateString[0]);
        int month = Integer.parseInt(productCreateDateString[1]);
        int day = Integer.parseInt(productCreateDateString[2]);
        return LocalDate.of(year, month, day);
    }
}
