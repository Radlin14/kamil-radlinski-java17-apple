package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int [] numbers = new int[20];
      for (int i=0 ; i <numbers.length ; i++){
          numbers[i] = i + 1;
      }
      //When
        double average = 10.5;
        //Then
        Assertions.assertEquals(average,ArrayOperations.getAverage(numbers));
    }
}
