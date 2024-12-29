package com.academy.course.lesson14.home.work;

import static com.academy.course.lesson14.home.work.MyMethodsException.*;

public class Main {

    public static void main(String[] args) {

        try {
            checkAge(50);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Проверка возраста завершена.\n");
        }

        boolean isAuthorized = false;
        try {
            checkAccess(isAuthorized);
            checkBalance(0);
        } catch (NegativeBalanceException | UnauthorizedAccessException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Проверка доступа и баланса завершена.\n");
        }
    }
}


