package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
   void testGetPeopleQuantity(){
       //Given
        Continent europe = new Continent();
        europe.addCountry(new Country(new BigDecimal("123456")));
        europe.addCountry(new Country(new BigDecimal("234567")));
        europe.addCountry(new Country(new BigDecimal("456789")));
        Continent america = new Continent();
        america.addCountry(new Country(new BigDecimal("987654")));
        america.addCountry(new Country(new BigDecimal("876543")));
        america.addCountry(new Country(new BigDecimal("765432")));
        Continent africa = new Continent();
        africa.addCountry(new Country(new BigDecimal("12346789")));
        africa.addCountry(new Country(new BigDecimal("13456789")));
        africa.addCountry(new Country(new BigDecimal("14567891")));
        //When
        World world = new World();
        world.addContinent(europe);
        world.addContinent(america);
        world.addContinent(africa);
        BigDecimal expected = new BigDecimal("43815910");
        //Then
        Assertions.assertEquals(expected,world.getPeopleQuantity());

    }
}
