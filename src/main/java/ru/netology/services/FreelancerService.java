package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Месяц отдыха
                money -= expenses;
                money -= money / 3;
                count++;
            } else {
                // Месяц работы
                money += income;
                money -= expenses;
            }
        }
        return count;
    }
}

