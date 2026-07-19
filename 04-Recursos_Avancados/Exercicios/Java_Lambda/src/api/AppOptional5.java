package api;

import java.util.Map;

public class AppOptional5 {
    public static void main(String[] args) {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));
        people
                .getNameById(6)
                .filter(n -> n.startsWith("R"))
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Name does not starts with R")
                );

    }
}
