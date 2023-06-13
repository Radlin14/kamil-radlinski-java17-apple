package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("KAMIL",String::toLowerCase);
//        poemBeautifier.beautify("Marta",String::toUpperCase);
//        poemBeautifier.beautify("Kasia",text -> text + "aaaaa");
//        poemBeautifier.beautify("Barbara",text -> text + "ABC");
//        poemBeautifier.beautify("Basia",text ->"ABC" + text);
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}