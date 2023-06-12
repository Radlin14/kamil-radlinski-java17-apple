package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import com.kodilla.testing.TestingMain;

import java.util.ArrayList;


public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when new list is empty " +
            "then exterminate method should return 'Lista jest pusta'")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
         oddNumbersExterminator.exterminate();
        //Then
    }
    @DisplayName("If the list contains odd and even numbers, " +
            "then the method should filter the numbers and leave only the even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        //When
        //Then
    }
}
