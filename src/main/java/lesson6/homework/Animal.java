package lesson6.homework;

public class Animal {
    protected String name;
    protected String color;
    private final String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public void printInfo() {
        System.out.printf("Type: %s, name: %s, color: %s\n", this.type, this.name, this.color);
    }

    public int run(int distance) {
        System.out.printf("%s %s ran %d meters\n", this.type, this.name, distance);
        return distance;
    }

    public int swim(int distance) {
        System.out.printf("%s %s swam %d meters\n", this.type, this.name, distance);
        return distance;
    }
}
