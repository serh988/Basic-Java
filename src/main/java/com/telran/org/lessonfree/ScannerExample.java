package com.telran.org.lessonthree;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Scanner - объект для получения данных из консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your age:");
        // ввод числа с клавиатуры и присвоение этого числа в переменную age
        // nextInt() - это запрос на ввод целого числа с клавиатуры
        int age = scanner.nextInt();

        System.out.println("Your age is " + age);
    }
}

