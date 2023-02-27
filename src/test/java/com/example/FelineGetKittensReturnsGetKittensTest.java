package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FelineGetKittensReturnsGetKittensTest {

    Feline feline = new Feline();

    @Test
    public void checkGetKittensReturnsKittensCount() {
        int actual = feline.getKittens();
        int expected = 1;

        assertEquals(expected, actual);
    }


}
