package com.oopdemo;

import java.util.Arrays;

/**
 * @author JOHNNGUYEN
 * @Project OOPDemo
 * @Created 14/05/2020 - 9:37 AM
 */
public class AnimalCounting {
    public static void main(String args[]) {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Dogs()),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphins(),
                new Dogs(),
                new Butterfly(),
                new Cats()
        };

        long countFly = Arrays.stream(animals).filter(animal -> "fly".equals(animal.move())).count();
        assert countFly == 2;

        long countWalk = Arrays.stream(animals).filter(animal -> "walk".equals(animal.move())).count();
        assert countWalk == 3;

        long countSing = Arrays.stream(animals).filter(animal -> "sing".equals(animal.sound())).count();
        assert countSing == 1;

        long countSwim = Arrays.stream(animals).filter(animal -> "swim".equals(animal.move())).count();
        assert countSwim == 5;

    }
}
