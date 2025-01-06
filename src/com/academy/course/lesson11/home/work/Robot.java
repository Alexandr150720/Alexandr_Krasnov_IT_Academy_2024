package com.academy.course.lesson11.home.work;

import com.academy.course.lesson11.home.work.part.IBody;
import com.academy.course.lesson11.home.work.part.IHead;

public class Robot<T, U> {

    private String name;
    private T body;
    private U head;

    public Robot(String name, T body, U head) {
        this.name = name;
        this.body = body;
        this.head = head;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", body=" + body +
                ", head=" + head +
                '}';
    }
}
