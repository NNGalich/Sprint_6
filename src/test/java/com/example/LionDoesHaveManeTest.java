package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionDoesHaveManeTest {


    @Test
    public void checkThatLionHasMane() throws Exception {

        Lion lion = new Lion(Constants.MALE);

        boolean expected = true;
        boolean actual = lion.doesHaveMane();

        assertEquals(expected, actual);
    }

    @Test
    public void checkThatLionDoesNotHaveMane() throws Exception {

        Lion lion = new Lion(Constants.FEMALE);

        boolean expected = false;
        boolean actual = lion.doesHaveMane();

        assertEquals(expected, actual);
    }

    @Test
    public void checkThatLionThrowsOnUnknownSex() throws Exception {
        assertThrows(
                "Используйте допустимые значения пола животного - самец или самка",
                Exception.class,
                () -> new Lion("ololo")
        );
    }
}