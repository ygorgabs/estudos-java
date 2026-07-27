package exerciciosStream;

import java.util.List;

public class StreamEx05 {
    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers2 = List.of(15, 24, 32, 74, 99, 44, 81);
        System.out.println(numbers1.stream().allMatch(n -> n > 10));
        System.out.println(numbers2.stream().allMatch(n -> n > 10));
    }
}
