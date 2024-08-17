package com.telran.org.homework.lessonten;

public class ReverseWords {

    public static void main(String[] args) {
        String sentence = "mama papa";

        // Вызов метода для изменения порядка слов
        String result = reverseWords(sentence);
        System.out.println(result); // Вывод результата
    }

    // Метод для реверса порядка слов в строке
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" "); // Разделение строки на слова
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" "); // Добавление слов в обратном порядке
        }

        return sb.toString().trim(); // Возврат результата с обрезанными пробелами
    }
}
