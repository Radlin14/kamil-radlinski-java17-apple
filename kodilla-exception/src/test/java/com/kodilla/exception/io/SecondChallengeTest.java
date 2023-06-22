package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTest {

    @Test
    void testBoundaryCasesOfMethodProbablyIWillThrowException(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
       assertAll(
               ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(2,1)),
               ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(0.99,1)),
               ()->assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(1,1.5)),
               ()->assertDoesNotThrow(()->secondChallenge.probablyIWillThrowException(1,1))
       );
    }
}
