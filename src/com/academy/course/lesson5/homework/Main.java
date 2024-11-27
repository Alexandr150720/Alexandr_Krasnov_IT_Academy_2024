package com.academy.course.lesson5.homework;

public class Main {

    final static String ABC = "abcdifghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Cat cat = new Cat();

// Subtask 1
        System.out.println("Task1");

        int counter = 0;
        while (counter < 10) {
            System.out.println(cat.getName() + " " + cat.getAge());
            counter++;
        }

// Subtask 2
        System.out.println("\nTask2");

        for (int j = 0; j < 10; j++) {
            cat.setName(getRandomName());
            cat.setAge(getRandomAge());

            String result = "Name: " + cat.getName() + " " + "Age: " + cat.getAge();
            System.out.println(result);
        }

// Subtask 3
        System.out.println("\nTask3");

        counter = 0;
        do {
            int age = getRandomAge();
            String name = getRandomName();

            Cat cat2 = new Cat(age, name);
            System.out.println(cat2);

            counter++;
        } while (counter < 10);

// Subtask 4
        System.out.println("\nTask4");

        Cat[] cats = new Cat[5];
        for (int i = 0; i < 5; i++) {
            Cat cat3 = new Cat(getRandomAge(), getRandomName());
            cats[i] = cat3;
        }

        for (Cat anotherCat : cats) {
            System.out.println(anotherCat);
        }

    }

    private static String getRandomName() {
        String name = "";
        for (int i = 0; i < 5; i++) {
            double random = Math.random();
            int symbolNumber = (int) (random * ABC.length());
            char letter = ABC.charAt(symbolNumber);

            if (i == 0) {
                letter = Character.toUpperCase(letter);
            }

            name = name + letter;
        }

        return name;
    }

    private static int getRandomAge() {
        return (int) (Math.random() * 27 + 1);
    }
}
