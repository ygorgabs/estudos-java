package api;

import java.util.Map;

public class AppOptional2 {
    public static void main(String[] args) {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));
        people.getNameById(4).ifPresent(s -> System.out.println(s.toUpperCase()));
    }
}
