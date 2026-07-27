package exerciciosStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx03 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "php", "ruby", "javascript");
        languages.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }
}
