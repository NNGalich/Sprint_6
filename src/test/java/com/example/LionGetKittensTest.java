package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {

    @Mock
    Feline myMock;

    @Test
    public void checkThatGetKittensReturnsKittensCount() throws Exception {

        Lion lion = new Lion(Constants.MALE, myMock);

        int expected = 4;
        Mockito.when(myMock.getKittens()).thenReturn(expected);
        int actual = lion.getKittens();

        assertEquals(expected, actual);

        Mockito.verify(myMock).getKittens();

    }
}
