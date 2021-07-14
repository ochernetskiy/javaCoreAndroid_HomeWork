package lesson7.homework;

import java.util.Arrays;

public class HomeWork7 {
    public static void main(String[] args) {

        catsAndBowls();

    }

    private static void catsAndBowls() {
        Cat[] cats = {
                new Cat("Barsik", 30),
                new Cat("Murzik", 20),
                new Cat("Jack", 8),
                new Cat("Tom", 35)
        };

        Bowl bowl = new Bowl();
        bowl.putFoodIntoBowl(50);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println(bowl.getFood());

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

}
