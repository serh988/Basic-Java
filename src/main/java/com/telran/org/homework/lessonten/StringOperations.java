package com.telran.org.homework.lessonten;

public class StringOperations {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Вызов метода concatReversStr
        String result = concatReversStr(str1, str2);
        System.out.println(result); // Вывод результата
    }

    // Метод для соединения двух строк и их реверсирования
    public static String concatReversStr(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(str2);  // Соединение строк
        return sb.reverse().toString(); // Реверс и возврат результата
    }
}
