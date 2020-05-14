package com.oopdemo;

/**
 * @author JOHNNGUYEN
 * @Project OOPDemo
 * @Created 14/05/2020 - 8:29 AM
 */
public interface Animal {
    String move();

    String sound();
}

class Bird implements Animal {
    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String sound() {
        return "sing";
    }
}

class Duck extends Bird {
    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String sound() {
        return "Quack, quack";
    }
}

class Chicken extends Bird {
    @Override
    public String move() {
        return "";
    }

    @Override
    public String sound() {
        return "Cluck, cluck";
    }
}

class Rooster extends Chicken {
    @Override
    public String sound() {
        return "Cock-a-doodle-doo";
    }
}

class Dogs implements Animal {
    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String sound() {
        return "Woof, woof";
    }
}

class Cats implements Animal {
    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String sound() {
        return "Meow";
    }
}

class Parrot implements Animal {
    private Animal animal;

    private Parrot() {
    }

    public Parrot(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String move() {
        return animal.move();
    }

    @Override
    public String sound() {
        return animal.sound();
    }
}
