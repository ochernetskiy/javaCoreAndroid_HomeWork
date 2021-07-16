package lesson8.homework;

public class HomeWork8 {
    public static void main(String[] args) {
        Participant[] participants = {
                new Man("Jack", 1500, 100),
                new Man("John", 1000, 75),
                new Cat("Garfield", 500, 200),
                new Cat("Tom", 350, 150),
                new Robot("R2D2", 80000, 1000),
                new Robot("R3D3", 100000, 2000)
        };

        Trap[] traps = {
                new Track(1000),
                new Wall(100),
                new Track(1000),
                new Wall(50),
                new Track(1000),
                new Wall(334)
        };


        for (Participant participant : participants) {
            for (Trap trap : traps) {
                if (!trap.make(participant)) break;
            }
        }
    }
}
