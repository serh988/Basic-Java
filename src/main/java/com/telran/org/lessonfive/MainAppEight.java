package com.telran.org.lessonfive;

import java.util.Scanner;

public class MainAppEight {
    public static void main(String[] args) {
        // && - short operator AND , & - full operator AND
        // || - short operator OR  , | - full operator OR
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two number from 0");
        System.out.println("First number : ");
        int first = scanner.nextInt();
        System.out.println("Second number : ");
        int second = scanner.nextInt();

        System.out.println("\nCheck && conditional");
        // if == true , (first > 0) == true and (second > 0) == true
        if ((first > 0) && (second > 0)) {
            System.out.println("Both of them more than zero");
        } else {
            System.out.println("One of them less than zero");
        }
    }
}
