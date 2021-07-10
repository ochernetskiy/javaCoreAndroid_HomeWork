package lesson6.homework;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color, "Dog");
    }

    @Override
    public int run(int distance) {
        if (distance > 0 && distance <= 500) {
            System.out.printf("Dog %s ran %d meters\n", this.name, distance);
        } else System.out.printf("Dog %s couldn't run %d meters \n", this.name, distance);
        return distance;
    }

    @Override
    public int swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.printf("Dog %s swam %d meters\n", this.name, distance);
        } else System.out.printf("Dog %s couldn't swim %d meters \n", this.name, distance);
        return distance;
    }
}
