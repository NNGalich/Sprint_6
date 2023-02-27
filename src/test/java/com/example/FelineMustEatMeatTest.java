package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineMustEatMeatTest {
    Feline feline = new Feline();

    @Test
    public void mustEatMeat() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, actual);
    }

}
