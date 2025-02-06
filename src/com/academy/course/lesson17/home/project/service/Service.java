package com.academy.course.lesson17.home.project.service;

import java.util.List;

public interface Service<T, R> {

    boolean create(T t);
    T read(R r);
    boolean delete(R r);
    List<T> readAll();


}
