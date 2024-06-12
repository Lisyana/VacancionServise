package ru.netology.javaqa.Vacantion.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/main/resources/vacancion.csv")
    public void testCalcVacationMonths(int income, int expenses, int threshold, int expected) {
        VacancionServise service = new VacancionServise();
        int actual = service.calcVacationMonths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}