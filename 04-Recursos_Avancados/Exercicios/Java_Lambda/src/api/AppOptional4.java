package api;

import java.util.Map;

public class AppOptional4 {
    public static void main(String[] args) {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));
//        var name = people.getNameById(6).orElse("X");
//        var name = people.getNameById(6).orElseGet(() -> "X");
        var name = people.getNameById(6).orElseThrow();
        System.out.println(name);
    }
}
