package api;

import java.util.Optional;

public class AppOptional7 {
    public static void main(String[] args) {
        var s1 = Optional.of("A").orElse(get());
        System.out.println(s1);

//        var s2 = Optional.of("A").orElseGet(() -> get());
//        System.out.println(s2);
    }

    private static String get(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "B";
    }
}
