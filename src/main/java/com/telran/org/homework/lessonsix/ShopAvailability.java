package com.telran.org.homework.lessonsix;

public class ShopAvailability {

    public static void main(String[] args) {
        boolean isEdekaOpen = true; // можно изменить на false для тестирования
        boolean isReweOpen = false; // можно изменить на true для тестирования

        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это " + canBuy);
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}
