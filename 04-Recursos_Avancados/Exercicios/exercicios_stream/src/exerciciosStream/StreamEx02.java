package exerciciosStream;

import java.util.Arrays;
import java.util.List;

public class StreamEx02 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "php", "ruby", "javascript");
        List<String> languagesUpperCase = languages.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(languagesUpperCase);
    }
}
