package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Starting a unit test");
    }

    @AfterEach
    public void after() {
        System.out.println("Unit test execution completed");
    }
    @DisplayName("When testingList is empty, test should return true")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> testingList = oddNumbersExterminator.exterminate(new ArrayList<>());
        //Then
        Assertions.assertTrue(testingList.isEmpty());
    }
    @DisplayName("After calling the method on the testList, we should get only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> testList = oddNumbersExterminator.exterminate(List.of(1,2,3,4));
        //When
        List<Integer> expectedList = List.of(2,4);
        //Then
        Assertions.assertEquals(expectedList,testList);
    }

}
