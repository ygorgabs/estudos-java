package concurrency;

import java.util.Random;

public class Frog extends Thread {
    private static final int MAX_JUMP = 50;
    private static final int MAX_REST = 500;
    private static final Object MONITOR = new Object();

    private final String name;
    private final int totalDistance;
    private int currentDistance;
    private int lastJump;

    private static int position;

    public Frog(String name, int totalDistance) {
        this.name = name;
        this.totalDistance = totalDistance;
    }

    @Override
    public void run() {
        while (currentDistance < totalDistance) {
            jump();
            report();
            rest();
        }
        crossTheLine();
    }

    private void jump() {
       lastJump = new Random().nextInt(0, MAX_JUMP);
       currentDistance += lastJump;

       if(currentDistance > totalDistance) currentDistance = totalDistance;
    }

    private void report() {
        System.out.printf("%s jumped %d cm. Total distance is %d cm%n", name, lastJump, currentDistance);
    }

    private void rest() {
        int time = new Random().nextInt(0, MAX_REST);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void crossTheLine(){
        synchronized (MONITOR){
            position++;
        }
        System.out.printf("%s finished the race in position %d%n", name, position);
    }
}
