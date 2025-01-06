package com.academy.course.lesson11.home.work.part;

public class Head implements IHead {

    private String name;

    public Head(String name) {
        this.name = name;
    }

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
