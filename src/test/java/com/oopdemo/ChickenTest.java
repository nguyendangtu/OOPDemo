package com.oopdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author JOHNNGUYEN
 * @Project OOPDemo
 * @Created 14/05/2020 - 8:37 AM
 */
class AnimalTest {

    @Test
    public void testDuck() {
        Duck duck = new Duck();
        assertEquals(duck.move(), "swim");
        assertEquals(duck.sound(), "Quack, quack");
    }

    @Test
    public void testChicken() {
        Chicken chicken = new Chicken();
        assertEquals(chicken.move(), "");
        assertEquals(chicken.sound(), "Cluck, cluck");
    }
}