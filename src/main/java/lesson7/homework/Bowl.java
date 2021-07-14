package lesson7.homework;

public class Bowl {
    private int food;

    public void putFoodIntoBowl(int amount) {
        this.food += amount;
        System.out.printf("Food increased for %d, now: %d\n", amount, this.food);
    }

    public boolean decreaseFoodFromBowl(int amount) {
        if (amount > this.food) {
            System.out.printf("There not enough food, %d present, %d you want\n", this.food, amount);
            return false;
        }

        this.food -= amount;
        System.out.printf("Food decreased for %d, now: %d\n", amount, this.food);
        return true;
    }

    public int getFood() {
        return food;
    }
}
