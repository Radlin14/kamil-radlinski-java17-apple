package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CalculatorTestSuite {


    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(4.0,1.5);
        double resultSub = calculator.sub(4.0,1.5);
        double resultMul = calculator.mul(4.0,1.5);
        double resultDiv = calculator.div(4.0,1.5);
//Then
        Assertions.assertEquals(5.5,resultAdd);
        Assertions.assertEquals(2.5,resultSub);
        Assertions.assertEquals(6.0,resultMul);
        Assertions.assertEquals(2.66,resultDiv,.01);

    }
}
