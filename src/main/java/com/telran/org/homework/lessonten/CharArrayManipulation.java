package com.telran.org.homework.lessonten;

public class CharArrayManipulation {

    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

        // Вызов метода для объединения и замены символа
        String result = replaceAndConcat(arr, '?', 'e');
        System.out.println(result); // Вывод результата
    }

    // Метод для замены символа и объединения массива в строку
    public static String replaceAndConcat(char[] arr, char oldChar, char newChar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldChar) {
                arr[i] = newChar; // Замена символа
            }
        }
        return new String(arr); // Преобразование массива в строку
    }
}
