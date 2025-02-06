package com.academy.course.lesson12.home.work;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> array = new MyArrayList<>();
        System.out.println("Пустой? :" + array.isEmpty());
        System.out.println("Количество элементов: " + array.size());
        array.add(10);
        array.add(5);
        array.add(0,7);
        array.add(2);
        array.add(13);
        array.add(9);
        array.add(6);
        System.out.println(array);
        System.out.println("Пустой? :" + array.isEmpty());
        System.out.println("Количество элементов: " + array.size());
        System.out.println("Содержит ли элемент 2: " + array.contains(2));
        System.out.println("Содержит ли элемент 1: " + array.contains(1));
        array.remove(0);// по индексу
        Integer o = 5;
        array.remove(o);// удаление объекта
        System.out.println("Array:" + array);

        MyList<Integer> array2 = new MyArrayList<>();
        array2.add(1);
        array2.add(2);
        array2.add(3);
        System.out.println("Array2: " + array2);

        array.removeAll(array2);
        System.out.println("Результат удаления: " + array);

        array.addAll(array2);
        System.out.println("Результат добавления: " + array);

        array.addAll(3, array2);
        System.out.println("Результат добавления по индексу: " + array);

        System.out.println("Элемент листа под 4 индексом: " + array.get(4));

        System.out.println("Индекс первого вхождения (2): " + array.indexOf(5));
        System.out.println("Индекс последнего вхождения (2): " + array.lastIndexOf(2));

        array.set(2, 15);
        System.out.println(array);

        Comparator<Integer> comp = new IntegerComparator();
        array.sort(comp);

        System.out.println(array);
    }
}
