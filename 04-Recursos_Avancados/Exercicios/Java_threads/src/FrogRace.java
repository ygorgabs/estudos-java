import concurrency.Frog;

public class FrogRace {
    private static final int MAX_FROGS = 5;
    private static final int MAX_DISTANCE = 500;

    public static void main(String[] args) {
        Frog[] frogs = new Frog[MAX_FROGS];

        for (int i = 0; i < frogs.length; i++) {
            frogs[i] = new Frog("Frog " + (i + 1), MAX_DISTANCE);
            frogs[i].start();
        }
    }
}
