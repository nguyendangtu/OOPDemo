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

class Fish implements Animal {
    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String sound() {
        return "";
    }
}

abstract class SpecialFish extends Fish {
    abstract String label();
}

class Shark extends SpecialFish {
    @Override
    public String label() {
        return "Sharks are large and grey";
    }

    public String eat() {
        return "Sharks eat other fish";
    }
}

class Clownfish extends SpecialFish {
    @Override
    public String label() {
        return "Clownfish are small and colourful (orange)";
    }

    public String makeJoke() {
        return "make joke";
    }
}

class Dolphins extends SpecialFish {
    @Override
    public String label() {
        return "Dolphins is not a fish but they are good swimmer";
    }
}

class Butterfly implements Animal {
    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String sound() {
        return "";
    }
}

class Caterpillar extends Butterfly implements Animal {
    private boolean isButterfly;

    @Override
    public String move() {
        if (isButterfly) {
            return super.move();
        }
        return "walk";
    }

    public void convertToButterfly() {
        isButterfly = true;
    }
}

