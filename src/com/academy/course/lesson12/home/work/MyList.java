package com.academy.course.lesson12.home.work;

import java.util.Collection;
import java.util.Comparator;

public interface MyList <T>{

    int size() ;
    boolean isEmpty() ;
    boolean contains(Object var1) ;
    boolean add(T var1) ;
    boolean remove(Object var1);
    boolean addAll(MyList<? extends T> var1);
    boolean removeAll(MyList<T> col);
    void add(int index, Object obj);
    boolean addAll(int index, MyList<? extends T> col);
    Object get(int index);
    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    Object remove(int index);
    Object set(int index, T obj);
    void sort(Comparator<? super T> comp);
}
