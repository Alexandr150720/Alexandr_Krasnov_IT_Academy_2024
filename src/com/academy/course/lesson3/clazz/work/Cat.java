package com.academy.course.lesson3.clazz.work;

public class Cat {

    int age;
    String name;

//    public Cat() {
//    }

//    public Cat(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
