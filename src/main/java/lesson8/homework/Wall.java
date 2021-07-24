package lesson8.homework;

public class Wall implements Trap {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean make(Participant participant) {
        if (participant.jump(this.height)) {
            System.out.printf("%s %s jumped over a wall %d meters high.\n", participant.getClass().getSimpleName(), participant.getName(), height);
            return true;
        }
        System.out.printf("%s %s didn't jump over a wall %d meters high.\n", participant.getClass().getSimpleName(), participant.getName(), height);
        return false;
    }
}
