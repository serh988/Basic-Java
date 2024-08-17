package com.telran.org.homework.lessonfour;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух чисел
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        // Вызов методов для выполнения операций и вывод результатов
        System.out.println("Сложение: " + getSum(a, b));
        System.out.println("Вычитание: " + getSubtraction(a, b));
        System.out.println("Умножение: " + getMultiplication(a, b));
        System.out.println("Деление: " + getDivision(a, b));
    }

    // Метод для сложения
    public static int getSum(int a, int b) {
        return a + b;
    }

    // Метод для вычитания
    public static int getSubtraction(int a, int b) {
        return a - b;
    }

    // Метод для умножения
    public static int getMultiplication(int a, int b) {
        return a * b;
    }

    // Метод для деления
    public static double getDivision(int a, int b) {
        if (b == 0) {
            System.out.println("Ошибка: Деление на ноль!");
            return 0;
        }
        return (double) a / b;
    }
}
