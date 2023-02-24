package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodTest {

    @Mock
    Feline myMock;

    @Test
    public void checkThatLionGetCorrectFood() throws Exception {
        Lion lion = new Lion(Constants.MALE, myMock);

        List<String> expected = List.of("ololo", "trololo");
        Mockito.when(myMock.getFood(Constants.PREDATOR)).thenReturn(expected);
        List<String> actual = lion.getFood();

        assertEquals(expected, actual);

        Mockito.verify(myMock).getFood(Constants.PREDATOR);

    }

}