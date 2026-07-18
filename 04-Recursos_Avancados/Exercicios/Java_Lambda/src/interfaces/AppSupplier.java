package interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class AppSupplier {
    public static void main(String[] args) {
        int n1 = generate(() -> 1);
        System.out.println(n1);
        int n2 = generate(() -> (int) (Math.random() * 1000));
        System.out.println(n2);
        System.out.println(
                generate(() -> {
            Random random = new Random();
            return random.nextInt(10, 20);
        }));
    }

    private static int generate(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
