package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private Logger logger;

    @Test
    void showLastLog() {
        //Given & When
        logger = Logger.INSTANCE;
        logger.log("Kamil");
        //Then
        assertEquals("Kamil", logger.getLastLog());
    }

    @Test
    void showLastLogSecond() {
        //Given & When
        logger = Logger.INSTANCE;
        logger.log("Kamil");
        logger.log("Damian");
        logger.log("Kacper");
        //Then
        assertEquals("Kacper", logger.getLastLog());
    }
}
