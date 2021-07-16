package lesson7.homework;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean eat(Bowl bowl) {
        if (bowl.decreaseFoodFromBowl(appetite)) {
            System.out.printf("Cat %s ate for %d food\n", this.name, this.appetite);
            this.satiety = true;
            return true;
        }
        System.out.printf("These food isn't enough for the cat %s, need %d food\n", this.name, this.appetite);
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}


