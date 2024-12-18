package com.academy.course.lesson11.home.work;

import com.academy.course.lesson11.home.work.part.IBody;
import com.academy.course.lesson11.home.work.part.IHead;

public class Robot {

    private String name;
    private IBody body;
    private IHead head;

    public Robot(String name, IBody body, IHead head) {
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
