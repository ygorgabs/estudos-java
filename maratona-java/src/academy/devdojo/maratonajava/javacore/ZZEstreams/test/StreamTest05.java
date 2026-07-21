package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
//        String[] split = words.get(0).split("");
//        System.out.println(Arrays.toString(split));
//
//        List<String[]> collect = words.stream().map(e -> e.split("")).toList();
//        Stream<String> stream = Arrays.stream(split);

        List<String> letters2 = words.stream()
                .map(e -> e.split(""))
                .flatMap(Arrays::stream)
                .toList();

        System.out.println(letters2);

    }
}
