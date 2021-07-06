package lesson5;

import java.time.Year;

public class Cat {
    static String type = "CAT";
    private String name;
    private String color;
    private int birthYear;

    public Cat() {
        System.out.println("Cat born!");
    }

    public Cat(String color) {
        this();
        this.color = color;
    }

    public Cat(String name, String color, int age) {
        this(color);
        this.name = name;
        this.birthYear = Year.now().getValue() - age;
    }

    public void printInfo() {
        System.out.printf("Cat: %s, color: %s, age: %d\n", this.name, this.color, this.getAge());
    }

    static void doSomethingStatic() {
        System.out.println("STATIC");
    }

    public void voice() {
        System.out.printf("Cat %s meow\n", this.name);
    }

    public void run() {
        System.out.printf("Cat %s runs\n", this.name);
    }

    public void run(int distance) {
        System.out.printf("Cat %s ran %d meters\n", this.name, distance);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }
}
