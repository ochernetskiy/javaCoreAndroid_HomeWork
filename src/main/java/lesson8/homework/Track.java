package lesson8.homework;

public class Track implements Trap {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean make(Participant participant) {
        if (participant.run(this.length)) {
            System.out.printf("%s %s ran a distance of %d meters.\n", participant.getClass().getSimpleName(), participant.getName(), length);
            return true;
        }
        System.out.printf("%s %s didn't run a distance of %d meters.\n", participant.getClass().getSimpleName(), participant.getName(), length);
        return false;
    }
}
