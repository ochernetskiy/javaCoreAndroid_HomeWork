package lesson6.homework;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color, "Cat");
    }

    @Override
    public int run(int distance) {
        if (distance > 0 && distance <= 200) {
            System.out.printf("Cat %s ran %d meters\n", this.name, distance);
        } else System.out.printf("Cat %s couldn't run %d meters \n", this.name, distance);
        return distance;
    }

    @Override
    public int swim(int distance) {
        System.out.printf("Cat %s can't swim\n", this.name);
        return distance;
    }
}
