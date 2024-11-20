package com.academy.course.lesson3.clazz.work;


public class Main {


    public static void main(String[] args) {

        Cat cat = new Cat();
        //Cat cat2 = new Cat(1, "Jim");

        cat.setAge(28);
        cat.age = 27;
        cat.setName("Bill");

        //System.out.println(cat.getName() + " : " + cat.getAge());
        System.out.println(cat);
    }
}