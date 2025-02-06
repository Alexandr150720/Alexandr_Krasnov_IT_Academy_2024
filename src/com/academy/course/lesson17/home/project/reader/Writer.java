package com.academy.course.lesson17.home.project.reader;

import java.util.List;

public interface Writer<T> {
    void write(T t);
    void writeAll(List<T> t);
}
