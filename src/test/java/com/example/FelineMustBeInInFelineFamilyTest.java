package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FelineMustBeInInFelineFamilyTest {
    Feline feline = new Feline();

    @Test
    public void mustBeInFelineFamily() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";

        assertEquals(expected, actual);
    }

}
