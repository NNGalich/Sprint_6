package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class NegativeAnimalTest {
    private final String kindOfAnimal;
    private Animal animal;

    public NegativeAnimalTest(String kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
    }

    @Before
    public void setUp() {
        this.animal = new Animal();
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalFood() {
        return new Object[][] {
                {" " },
                {"123"},
        };
    }

    @Test
    public void shouldBeFood() {
        assertThrows(
                "Неизвестный вид животного, используйте значение Травоядное или Хищник",
                Exception.class,
                () -> animal.getFood(kindOfAnimal)
        );
    }
}
