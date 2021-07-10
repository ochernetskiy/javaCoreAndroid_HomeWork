package lesson6.homework;

import java.util.Random;

public class HomeWork6 {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Jack", "black"),
                new Dog("Walle", "red"),
                new Dog("Fedor", "brown"),
                new Cat("Garfield", "red"),
                new Cat("Tom", "grey"),
                new Cat("Jordan", "black")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].printInfo();
            animals[i].run(RANDOM.nextInt(750));
            animals[i].swim(RANDOM.nextInt(50));
        }
    }
}
