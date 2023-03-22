package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatGetPredatorEatMeatTest {
    @Mock
    Feline myMock;

    @Test
    public void checkThatEatMeatReturnCorrectList() throws Exception {
        Cat cat = new Cat(myMock);

        List<String> expected = List.of("a", "bbb", "ccc");

        Mockito.when(myMock.eatMeat()).thenReturn(expected);

        List<String> actual = cat.getFood();
        assertEquals(expected, actual);

        Mockito.verify(myMock).eatMeat();
    }
}
