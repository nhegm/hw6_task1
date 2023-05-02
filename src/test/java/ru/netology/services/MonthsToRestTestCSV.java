package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthsToRestTestCSV {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/bonus.csv")

    public void testMothsToRest(int expected, int income, int expenses, int threshold) {
        MonthsToRest service = new MonthsToRest();

        int actual = service.calcMothsToRest(income, expenses, threshold);

        Assertions.assertEquals(actual, expected);
    }

}

