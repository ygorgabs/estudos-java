package concurrency;

import java.util.Queue;

public class Consumer extends Thread{
    private final Queue<Integer> queue;
    private final String name;

    public Consumer(String name, Queue<Integer> queue) {
        this.name = name;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            consume();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void consume() {
        synchronized (queue) {
            while (queue.isEmpty()) {
                System.out.printf("%s stopped%n", name);
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            int value = queue.poll();
            System.out.printf("%s consumed: %d%n", name, value);
            queue.notifyAll();
        }
    }
}
