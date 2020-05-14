package com.oopdemo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JOHNNGUYEN
 * @Project OOPDemo
 * @Created 14/05/2020 - 8:29 AM
 */
public interface Animal extends Serializable {
    String move();

    String sound();

    public static String defaultValue = "";

    String type();
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

    @Override
    public String type() {
        return "Bird";
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

    @Override
    public String type() {
        return "Duck";
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

    @Override
    public String type() {
        return "Chicken";
    }
}

class Rooster extends Chicken {
    private String language;
    private static Map<String, String> languages = new HashMap<String, String>() {{
        put("Danish", "kykyliky");
        put("Dutch", "kukeleku");
        put("Finnish", "kukko kiekuu");
        put("French", "cocorico");
        put("German", "kikeriki");
        put("Greek", "kikiriki");
        put("Hebrew", "coo-koo-ri-koo");
        put("Hungarian", "kukuriku");
        put("Italian", "chicchirichi");
        put("Japanese", "ko-ke-kok-ko-o");
        put("Portuguese", "cucurucu");
        put("Russian", "kukareku");
        put("Swedish", "kuckeliku");
        put("Turkish", "kuk-kurri-kuuu");
        put("Urdu", "kuklooku");
    }};

    @Override
    public String sound() {
        return languages.get(language);
    }

    @Override
    public String type() {
        return "Rooster";
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    @Override
    public String type() {
        return "Dogs";
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

    @Override
    public String type() {
        return "Cats";
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


    @Override
    public String type() {
        return "Parrot";
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

    @Override
    public String type() {
        return "Fish";
    }
}

abstract class SpecialFish extends Fish {
    abstract String label();

    @Override
    public String type() {
        return "SpecialFish";
    }
}

class Shark extends SpecialFish {
    @Override
    public String label() {
        return "Sharks are large and grey";
    }

    public String eat() {
        return "Sharks eat other fish";
    }

    @Override
    public String type() {
        return "Shark";
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

    @Override
    public String type() {
        return "Clownfish";
    }
}

class Dolphins extends SpecialFish {
    @Override
    public String label() {
        return "Dolphins is not a fish but they are good swimmer";
    }


    @Override
    public String type() {
        return "Dolphins";
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

    @Override
    public String type() {
        return "Butterfly";
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

    @Override
    public String type() {
        return "Caterpillar";
    }

    public void convertToButterfly() {
        isButterfly = true;
    }
}

