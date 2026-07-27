package exerciciosStream;

import java.util.Arrays;
import java.util.List;

public class StreamEx06 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 18, 55, 1, 99, 52, 55, 81, 72, 72, 49, 17);
        numbers.stream().distinct().sorted().forEach(System.out::println);
    }
}
