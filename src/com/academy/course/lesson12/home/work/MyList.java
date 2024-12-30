package com.academy.course.lesson12.home.work;

import java.util.Collection;
import java.util.Comparator;

public interface MyList <T>{

    int size() ;
    boolean isEmpty() ;
    boolean contains(T var1) ;
    boolean add(T var1) ;
    boolean remove(T var1);
    boolean addAll(MyList<? extends T> var1);
    boolean removeAll(MyList<T> col);
    void add(int index, T obj);
    boolean addAll(int index, MyList<? extends T> col);
    T get(int index);
    int indexOf(T obj);
    int lastIndexOf(T obj);
    T remove(int index);
    T set(int index, T obj);
    void sort(Comparator<? super T> comp);
    T[] toArray();
}
