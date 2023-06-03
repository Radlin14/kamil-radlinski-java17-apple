package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator = new Calculator(20,11);
        int addResult = calculator.add();
        int subtractResult = calculator.subtract();

        if (addResult==31){
            System.out.println("test OK");
        }
        else {
            System.out.println("Error!");
        }
        if (subtractResult==9){
            System.out.println("test OK");
        }
        else {
            System.out.println("Error!");
        }

    }
}
