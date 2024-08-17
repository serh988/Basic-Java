package com.telran.org.homework.lessonfive;

import java.util.Scanner;

public class ClosestToTen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух чисел m и n
        System.out.println("Введите число m: ");
        double m = scanner.nextDouble();

        System.out.println("Введите число n: ");
        double n = scanner.nextDouble();

        // Вызываем метод для определения ближайшего к 10 числа
        double closest = getClosestToTen(m, n);

        // Выводим результат
        System.out.println("Число " + closest + " ближе к 10.");
    }

    public static double getClosestToTen(double m, double n) {
        // Вычисляем разницу между числами и 10
        double diffM = Math.abs(10 - m);
        double diffN = Math.abs(10 - n);

        // Определяем, какое число ближе к 10
        if (diffM < diffN) {
            return m;
        } else {
            return n;
        }
    }
}
