package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class getFamilyTest {

    @Test
    public void checkThatGetFamilyReturnsTheCorrectString() {
        Animal animal = new Animal();

        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        assertEquals(expected, actual);
    }
}