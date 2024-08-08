package com.telran.org.homework;

public class HomeworkCarExample {

    public static void main(String[] args) {
        HomeworkCar car1 = new HomeworkCar(2.3, "BMW");
        HomeworkCar car2 = new HomeworkCar(1.8, "Audi");
        HomeworkCar car3 = new HomeworkCar(3.0, "Mercedes");
        HomeworkCar car4 = new HomeworkCar(1.5, "Volkswagen");
        HomeworkCar car5 = new HomeworkCar(2.0, "Ford");

        HomeworkCar[] cars = {car1, car2, car3, car4, car5};

        System.out.println("Initial list of cars:");
        printCars(cars);

        bubbleSortByPrice(cars);
        System.out.println("Cars sorted by price:");
        printCars(cars);

        bubbleSortByModel(cars);
        System.out.println("Cars sorted by model:");
        printCars(cars);
    }

    private static void printCars(HomeworkCar[] cars) {
        for (HomeworkCar car : cars) {
            System.out.println("Car - " + car.model + ", price = " + car.price);
        }
        System.out.println();
    }

    private static void bubbleSortByPrice(HomeworkCar[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].price > cars[j + 1].price) {
                    // Swap cars[j+1] and cars[j]
                    HomeworkCar temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSortByModel(HomeworkCar[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].model.compareTo(cars[j + 1].model) > 0) {
                    // Swap cars[j+1] and cars[j]
                    HomeworkCar temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }
}

