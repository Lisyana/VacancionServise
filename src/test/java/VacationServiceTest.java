package ru.netology.javaqa.Vacantion.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    public void testCalcVacationMonth() {
        VacancionServise servise = new VacancionServise();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = servise.calcVacancionMonth(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalcVacationMonthsExample2() {
        VacancionServise servise = new VacancionServise();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = servise.calcVacancionMonth(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}