package com.telran.org.homework.lessonthree;

public class StringManipulator {
    public static void main(String[] args) {
        // Создание строки
        String str = "I study Basic Java!";

        // Вызов метода, который выполняет различные операции со строкой
        manipulateString(str);
    }

    public static void manipulateString(String input) {
        // Распечатать последний символ строки
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // Проверить, содержит ли строка подстроку "Java"
        boolean containsJava = input.contains("Java");
        System.out.println("Содержит ли строка 'Java': " + containsJava);

        // Преобразовать строку в верхний регистр
        String upperCaseStr = input.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseStr);

        // Преобразовать строку в нижний регистр
        String lowerCaseStr = input.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

        // Вырезать подстроку "Java" из строки
        String substring = input.substring(input.indexOf("Java"), input.indexOf("Java") + "Java".length());
        System.out.println("Вырезанная подстрока 'Java': " + substring);
    }
}
