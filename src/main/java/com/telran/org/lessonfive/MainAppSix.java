package com.telran.org.lessonfive;

import java.util.Scanner;

public class MainAppSix {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number from 0  to 9");
            int num = scanner.nextInt();
            String infoString = getInfoString(num);
            System.out.println(infoString);
        }

        public static String getInfoString(int num) {
            if (num > 5) {
                return "Number greater than 5";
            } else if (num == 5) {
                return "Number is 5";
            } else {
                return "Number smaller than 5";
            }
        }
    }