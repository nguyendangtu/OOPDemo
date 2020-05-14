package com.oopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OopDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(OopDemoApplication.class, args);
    }

    @RestController
    class AnimalController {
        @GetMapping(path = "/create-animal")
        public String createAnimal(@RequestParam("name") String name) {
            Animal animal = null;
            switch (name) {
                case "Bird":
                    animal = new Bird();
                    break;
                case "Butterfly":
                    animal = new Butterfly();
                    break;
                case "Caterpillar":
                    animal = new Caterpillar();
                    break;
                case "Cats":
                    animal = new Cats();
                    break;
                case "Chicken":
                    animal = new Chicken();
                    break;
                case "Clownfish":
                    animal = new Clownfish();
                    break;
                case "Dogs":
                    animal = new Dogs();
                    break;
                case "Dolphins":
                    animal = new Dolphins();
                    break;
                case "Duck":
                    animal = new Duck();
                    break;
                case "Fish":
                    animal = new Fish();
                    break;
                case "Parrot":
                    animal = new Parrot(new Dogs());
                    break;
                case "Rooster":
                    animal = new Rooster();
                    break;
                case "Shark":
                    animal = new Shark();
                    break;
                default:
                    break;
            }
            if (null != animal) {
                return animal.toString();
            }

            return null;
        }
    }

}
