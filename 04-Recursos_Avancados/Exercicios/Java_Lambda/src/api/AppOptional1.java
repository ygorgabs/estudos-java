package api;

import java.util.Map;

public class AppOptional1 {
    public static void main(String[] args) {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        var name = people.getNameById(3);

        if(name.isPresent()){
            var upperName = name.get().toUpperCase();
            System.out.println(upperName);
        }
    }
}
