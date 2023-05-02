package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthsToRestTest {
    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void testMothsToRest(int expected, int income, int expenses, int threshold) {
        MonthsToRest service = new MonthsToRest();

        int actual = service.calcMothsToRest(income, expenses, threshold);

        Assertions.assertEquals(actual, expected);
    }

}

