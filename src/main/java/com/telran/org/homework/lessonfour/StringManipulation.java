package com.telran.org.homework.lessonfour;

public class StringManipulation {

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String result = processString(originalString);
        System.out.println("Результат: " + result);
    }

    // Первый метод принимает строку, преобразует её в верхний регистр и вызывает второй метод
    public static String processString(String input) {
        String upperCaseString = input.toUpperCase();
        return reverseString(upperCaseString);
    }

    // Второй метод принимает строку и возвращает её в обратном порядке
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}