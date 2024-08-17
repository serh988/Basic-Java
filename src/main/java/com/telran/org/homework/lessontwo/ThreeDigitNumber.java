package com.telran.org.homework.lessontwo;

import java.util.Scanner;

public class ThreeDigitNumber {

    public static void main(String[] args) {
        // Ввод трехзначного числа с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        // Извлечение цифр числа
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        // Вывод цифр на экран
        System.out.println("Число " + number + " -> " + hundreds + ", " + tens + ", " + units);
    }
}
