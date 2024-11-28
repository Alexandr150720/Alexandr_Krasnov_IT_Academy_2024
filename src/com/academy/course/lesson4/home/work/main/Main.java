package com.academy.course.lesson4.home.work.main;

import com.academy.course.lesson4.home.work.rainbow.Rainbow;

public class Main {

    public static void main(String[] args) {
        Rainbow rainbow = new Rainbow();

        System.out.println(rainbow.getColor(rainbow.ORANGE_COLOR_NUM, rainbow.ORANGE_COLOR_NUM));  // Orange
        System.out.println(rainbow.getColor(rainbow.BLUE_COLOR_NUM, rainbow.INDIGO_COLOR_NUM));  // Blue-Indigo
        System.out.println(rainbow.getColor(rainbow.RED_COLOR_NUM, rainbow.GREEN_COLOR_NUM));  // Invalid value
        System.out.println(rainbow.getColor(1, 15));  // Invalid value

        System.out.println(rainbow.getColor(rainbow.VIOLET_COLOR_NUM));  // Violet
        System.out.println(rainbow.getColor(10));  // Invalid value
    }
}
