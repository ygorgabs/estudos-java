package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long sum = 100_000_000;
        sumFor(sum);
        sumStreamIterate(sum);
        sumStreamIterateParallel(sum);
        sumLongStream(sum);
        sumLongStreamParallel(sum);
    }

    private static void sumFor(long num){
        System.out.println("Sum for: ");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 0; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
    private static void sumStreamIterate(long num){
        System.out.println("Sum Iterate: ");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
    private static void sumStreamIterateParallel(long num){
        System.out.println("Sum Stream Parallel: ");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void sumLongStream(long num){
        System.out.println("Sum LongStream: ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void sumLongStreamParallel(long num){
        System.out.println("Sum LongStream Parallel: ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
}
