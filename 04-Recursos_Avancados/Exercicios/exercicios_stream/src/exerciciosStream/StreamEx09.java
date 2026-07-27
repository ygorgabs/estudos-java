package exerciciosStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx09 {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.77, 1.51, 1.17, 1.8, 1.19, 1.45, 1.89);
        numbers.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        numbers.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
