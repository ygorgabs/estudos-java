package interfaces;

import java.util.function.BiFunction;

public class AppBiFunction {
    public static void main(String[] args) {
        System.out.println(combine(5, 2, (x, y) -> x + y));
        System.out.println(combine(5, 2, (x, y) -> x * y));
    }

    private static int combine(int n1, int n2, BiFunction<Integer, Integer, Integer> biFunction){
        return biFunction.apply(n1, n2);
    }
}
