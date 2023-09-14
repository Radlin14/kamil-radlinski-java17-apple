package com.kodilla.patterns.builder.bigmac;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {

        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Lettuce")
                .ingredient("Onion")
                .ingredient("Bacon")
                .build();

        // When
        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        int ingredientsCount = bigmac.getIngredients().size();

        // Then
        assertEquals("With sesame", bun);

        assertEquals(2, burgers);

        assertEquals("Barbecue", sauce);

        assertEquals(3, ingredientsCount);
    }
}

