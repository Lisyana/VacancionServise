package ru.netology.javaqa.Vacantion.service;

public class VacancionServise {

    public int calcVacationMonths(int income, int expenses, int threshold) {
        int money = 0;
        int vacationMonths = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                vacationMonths++;
            } else {
                money += income;
                money -= expenses;
            }
        }

        return vacationMonths;
    }
}