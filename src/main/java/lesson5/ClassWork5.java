package lesson5;

public class ClassWork5 {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.name = "Barsik";
//        cat.color = "grey";
//        cat.age = 2;
//
//        Cat c = new Cat();
//        c.name = "Murzik";
//        c.color = "red";
//        c.age = 1;

        Cat cat2 = new Cat("Vaska", "black", 3);

//        c.printInfo();
//        cat.printInfo();
        cat2.printInfo();
//        c.voice();
//        cat.voice();
        cat2.voice();
//        c.run();
//        cat.run();
        cat2.run();

        cat2.run(15);
    }
}
