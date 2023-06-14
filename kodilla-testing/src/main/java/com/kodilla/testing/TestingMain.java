package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addResult = calculator.add(10,5);
        int subtractResult = calculator.subtract(20,10);

        if (addResult == 15){
            System.out.println("ADD TEST OK");
        }
        else {
            System.out.println("ADD TEST ERROR");
        }

        if(subtractResult==10){
            System.out.println("SUBTRACT TEST OK");


        }
        else {
            System.out.println("SUBTRACT TEST ERROR");
        }
    }
}
