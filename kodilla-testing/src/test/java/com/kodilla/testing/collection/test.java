package com.kodilla.testing.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class test {

    @Test
    void testShouldReturnEmptyListForGiven() {
        //Given
        List<Integer> list = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(list);
        //Then
        Assertions.assertEquals(resultList, list);

    }

    @Test
    void testShouldRemoveFive() {
        //Given
        List<Integer> list = List.of(2,4,5);
        List<Integer> expectedList = List.of(2,4);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(list);
        //Then
        Assertions.assertEquals(expectedList,resultList);
    }
    @Test
    void testShouldReturnSameDateForEvenNumbersOnly() {
        //Given
        List<Integer> list = List.of(2,4,6);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(list);
        //Then
        Assertions.assertEquals(resultList, list);

    }
    @Test
    void testShouldReturnemptyListForOddNumbersOnly() {
        //Given
        List<Integer> list = List.of(3,5,7);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> expectedList= new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(list);
        //Then
        Assertions.assertEquals(expectedList, resultList);

    }
}