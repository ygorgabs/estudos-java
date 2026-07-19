package api;

import java.util.Map;

public class ExercicioOptional {
    public static void main(String[] args) {
        PhoneBook   phoneBook = new PhoneBook(Map.of(
                "Ygor", 11111111,
                "Pedro", 22222222,
                "Luana", 33333333
        ));

//        Integer fone = phoneBook.findByName("Ygor").orElseThrow(IllegalArgumentException::new);
//        System.out.println(fone);

        phoneBook.findByName("Lucas").ifPresentOrElse(System.out::println, () -> { throw new IllegalArgumentException();});
    }
}
