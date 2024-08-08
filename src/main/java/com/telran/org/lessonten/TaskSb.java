package com.telran.org.lessonten;

import java.util.Arrays;

public class TaskSb {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(" ").append("World");
        System.out.println(sb);
        sb.insert(5, " Unique").reverse();
        System.out.println(sb);
        char[] array = new char[20];
        sb.getChars(0, sb.length() - 1, array, 0);

        System.out.println(Arrays.toString(array));
        char[] charArray = sb.toString().toCharArray();
    }
}
