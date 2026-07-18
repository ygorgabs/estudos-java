package api;

import java.util.Map;

public class AppForEach2 {
    public static void main(String[] args) {
        var people = Map.of(
                1, "Pedro",
                2, "Maria",
                3, "Paulo",
                4, "Joana"
        );

        people.keySet().forEach(System.out::println);
        people.values().forEach(System.out::println);
        people.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
