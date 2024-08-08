package com.telran.org.lessonfour;

public class MethodExampleThree {

    public static void main(String[] args) {
        int count = getCountOfPages();
        System.out.println("Count of pages = " + count);

        System.out.println("Count of pages = " + getCountOfPages());
    }

    //Метод возвращает целое число
    //return - оператор возврата из метода
    public static int getCountOfPages() {
        return 10;
    }

    public static void printInfo() {
        System.out.println("Hello");
    }
}