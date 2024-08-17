package com.telran.org.homework.lessonthree;

import java.util.Scanner;

public class WordCombiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого слова
        System.out.println("Введите первое слово с четным количеством букв:");
        String word1 = scanner.nextLine();

        // Ввод второго слова
        System.out.println("Введите второе слово с четным количеством букв:");
        String word2 = scanner.nextLine();

        // Проверка, что оба слова имеют четное количество букв
        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            // Получение первой половины первого слова и второй половины второго слова
            String firstHalf = word1.substring(0, word1.length() / 2);
            String secondHalf = word2.substring(word2.length() / 2);

            // Комбинирование половин
            String combinedWord = firstHalf + secondHalf;

            // Вывод результата
            System.out.println("Результат: " + combinedWord);
        } else {
            System.out.println("Оба слова должны содержать четное количество букв!");
        }
    }
}
