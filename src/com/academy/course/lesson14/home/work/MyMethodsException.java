package com.academy.course.lesson14.home.work;

public class MyMethodsException {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 40) {
            throw new InvalidAgeException("Возраст должен быть в диапазоне от 0 до 40.");
        }
        System.out.println("Возраст корректен: " + age);
    }

    public static void checkBalance(double balance) throws NegativeBalanceException {
        if (balance < 0) {
            throw new NegativeBalanceException("Баланс не может быть отрицательным.");
        }
        System.out.println("Баланс корректен: " + balance);
    }

    public static void checkAccess(boolean isAuthorized) throws UnauthorizedAccessException {
        if (!isAuthorized) {
            throw new UnauthorizedAccessException("Доступ запрещен. Пользователь не авторизован.");
        }
        System.out.println("Доступ разрешен.");
    }
}
