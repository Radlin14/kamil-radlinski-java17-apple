package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        // Given
        User millenial = new Millenials("Zbyszek");
        User yGeneration = new YGeneration("Kacper");
        User zGeneration = new ZGeneration("Jessica");

        // When & Then
        assertEquals("Użytkownik Zbyszek: Używam Facebooka", millenial.sharePost());
        assertEquals("Użytkownik Kacper: Używam Twittera", yGeneration.sharePost());
        assertEquals("Użytkownik Jessica: Używam Snapchata", zGeneration.sharePost());
    }

    @Test
    void testIndividualSharingStrategy() {
        // Given
        User user = new Millenials("Zbyszek");

        // When
        user.setSocialPublisher(new TwitterPublisher());

        // Then
        assertEquals("Użytkownik Zbyszek: Używam Twittera", user.sharePost());
    }
}

