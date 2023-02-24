package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensReturnKittensCountTest {
    
    private final int kittensCount;

    private Feline feline;
    
    public FelineGetKittensReturnKittensCountTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Before
    public void setUp() {
        this.feline = new Feline();
    }

    @Parameterized.Parameters
    public static Object[][] FelineGetKittensReturnKittensCountTest() {
        return new Object[][] {
                { -5 },
                { -1 },
                { 0 },
                { 1 },
                { 10 },
        };
    }
    
    @Test
    public void checkKittensCount() {
        int actual = feline.getKittens(kittensCount);
        assertEquals(kittensCount, actual);
        
    }


}