package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        IntStream.range(1,50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        Stream.of("Faça elevar", "o cosmo", "no seu", "coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        int[] nums = {1,2,3,4,5};
        Arrays.stream(nums)
                .average()
                .ifPresent(System.out::println);

        try (Stream<String> lines = Files.lines(Path.of("file.txt"))) {
            lines.filter(l -> l.contains("Java")).forEach(System.out::println);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
