package com.academy.course.lesson12.home.work;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(4);

        MyList<Integer> array = new MyArrayList<>(4);
        System.out.println(array.isEmpty());

        System.out.println(array.add(2));
        array.add(1);
        array.add(4);
        array.add(7);
        array.add(8);
//        System.out.println(array.isEmpty());
//        System.out.println(array.size());
       Object i = 1;
//        System.out.println(array.remove(i));
//        System.out.println(array.remove(i));
//        System.out.println(array.size());

        array.add(2, i);
        System.out.println(array);
    }
}
