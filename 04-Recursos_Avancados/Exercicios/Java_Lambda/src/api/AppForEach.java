package api;

import java.util.List;

public class AppForEach {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5, 6);
//        for (Integer n : numbers) {
//            System.out.println(n);
//        }
        numbers.forEach(System.out::println);
    }
}
