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

    @Test
    public void testShark() {
        Shark shark = new Shark();
        assertEquals(shark.label(), "Sharks are large and grey");
        assertEquals(shark.eat(), "Sharks eat other fish");
    }

    @Test
    public void testClownfish() {
        Clownfish clownfish = new Clownfish();
        assertEquals(clownfish.label(), "Clownfish are small and colourful (orange)");
        assertEquals(clownfish.makeJoke(), "make joke");
    }

    @Test
    public void testDolphins() {
        Dolphins dolphins = new Dolphins();
        assertEquals(dolphins.label(), "Dolphins is not a fish but they are good swimmer");
    }

    @Test
    public void testButterfly() {
        Butterfly butterfly = new Butterfly();
        assertEquals(butterfly.move(), "fly");
        assertEquals(butterfly.sound(), "");
    }

    @Test
    public void testCaterpillar() {
        Caterpillar caterpillar = new Caterpillar();
        assertEquals(caterpillar.move(), "walk");
        assertEquals(caterpillar.sound(), "");

        //metamorphosis
        caterpillar.convertToButterfly();
        assertEquals(caterpillar.move(), "fly");
    }


}