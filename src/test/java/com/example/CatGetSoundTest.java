package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundTest {
    @Mock
    Feline feline;

    @Test
    public void checkThatGetSoundReturnsTheCorrectString() {
        Cat cat = new Cat(feline);

        String actual = cat.getSound();
        String expected = "Мяу";

        assertEquals(expected, actual);
    }

}