package ru.Example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat cat = new Cat(5,10,3);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getVoice() {
        assertEquals("Мяяяяяяу!", cat.getVoice());
    }

    @Test
    void foodType() {
    }

    @Test
    void canSwim() {
    }

    @Test
    void canClimbTree() {
    }
}