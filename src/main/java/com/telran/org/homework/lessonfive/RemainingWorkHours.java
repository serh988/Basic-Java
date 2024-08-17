package com.telran.org.homework.lessonfive;

import java.util.Random;

public class RemainingWorkHours {

    public static void main(String[] args) {
        Random random = new Random();

        // Генерация случайного числа от 0 до 28800
        int n = random.nextInt(28800);

        // Вывод количества секунд до конца рабочего дня
        System.out.println("Осталось " + n + " секунд до конца рабочего дня.");

        // Вычисление количества полных часов
        int remainingHours = n / 3600;

        // Вывод понятной фразы
        if (remainingHours > 1) {
            System.out.println("Осталось " + remainingHours + " часов.");
        } else if (remainingHours == 1) {
            System.out.println("Остался 1 час.");
        } else {
            System.out.println("Осталось менее часа.");
        }
    }
}
