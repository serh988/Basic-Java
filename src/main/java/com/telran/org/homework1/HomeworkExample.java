package com.telran.org.homework;

public class HomeworkExample {

    public static void main(String[] args) {
        String text = "Hello Java!";
        String result = methodOne(text);
        System.out.println(result);
    }

    public static String methodOne(String str) {
        String strUpper = str.toUpperCase();
        String resultFromTwo = methodTwo(strUpper);
        return resultFromTwo;
    }

    public static String methodTwo(String str) {
        String result = new StringBuilder(str).reverse().toString();
        return result;
    }
}
