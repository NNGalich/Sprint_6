package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionDoesHaveManeTest {

    @Mock
    Feline feline;

    @Test
    public void checkThatLionHasMane() throws Exception {

        Lion lion = new Lion(Constants.MALE, feline);

        boolean expected = true;
        boolean actual = lion.doesHaveMane();

        assertEquals(expected, actual);
    }

    @Test
    public void checkThatLionDoesNotHaveMane() throws Exception {

        Lion lion = new Lion(Constants.FEMALE, feline);

        boolean expected = false;
        boolean actual = lion.doesHaveMane();

        assertEquals(expected, actual);
    }

    @Test
    public void checkThatLionThrowsOnUnknownSex() {
        assertThrows(
                "Используйте допустимые значения пола животного - самец или самка",
                Exception.class,
                () -> new Lion("ololo", feline)
        );
    }
}
