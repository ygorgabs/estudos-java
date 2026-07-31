package concurrency;

import java.util.stream.Stream;

public class AppCounter3 {
    public static void main(String[] args) {
        SharedCounter2 c = new SharedCounter2();
        var threads = Stream
                .generate(() -> new Thread(c))
                .limit(5)
                .toList();

        threads.forEach(Thread::start);

        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.printf("Total: %d",c.getContador());
    }
}
