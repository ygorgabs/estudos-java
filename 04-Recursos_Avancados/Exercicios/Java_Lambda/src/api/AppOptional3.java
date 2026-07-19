package api;

import java.util.Map;

public class AppOptional3 {
    public static void main(String[] args) {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));
        people.getNameById(6).ifPresentOrElse(
                s -> System.out.println(s.toUpperCase()),
                () -> System.out.println("ID not found"));
    }
}
