package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PositiveAnimalTest {
    private final String kindOfAnimal;
    private final List<String> expected;
    private Animal animal;

    public PositiveAnimalTest(String kindOfAnimal, List<String> expected) {
        this.kindOfAnimal = kindOfAnimal;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        this.animal = new Animal();
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalFood() {
        return new Object[][] {
                { "Травоядное", List.of("Трава", "Различные растения")},
                { "Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void shouldBeFood() throws Exception {
        List<String> actual = animal.getFood(kindOfAnimal);
        assertEquals(expected, actual);
    }
}