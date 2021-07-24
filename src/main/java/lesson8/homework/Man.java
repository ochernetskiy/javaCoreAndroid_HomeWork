package lesson8.homework;

public class Man implements Participant {
    private String name;
    private int maxRun;
    private int maxJump;

    public Man(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        return this.maxRun >= length;
    }

    @Override
    public boolean jump(int height) {
        return this.maxJump >= height;
    }

    @Override
    public String getName() {
        return name;
    }
}
