package com.academy.course.lesson11.home.work.part;

public class Body implements IBody {

    private String name;

    public Body(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }


}
