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

    @Test
    public void testRooster() {
        Rooster rooster = new Rooster();
        assertEquals(rooster.move(), "");
        assertEquals(rooster.sound(), "Cock-a-doodle-doo");
    }

    @Test
    public void testParrot() {
        Parrot parrotDogs = new Parrot(new Dogs());
        assertEquals(parrotDogs.move(), "walk");
        assertEquals(parrotDogs.sound(), "Woof, woof");

        Parrot parrotCats = new Parrot(new Cats());
        assertEquals(parrotCats.move(), "walk");
        assertEquals(parrotCats.sound(), "Meow");
    }
}