package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filter = filter(numbers, i -> i % 2 == 0);
        System.out.println(filter);
    }

    private static List<Integer> filter(List<Integer> list, Predicate<Integer> condition) {
        List<Integer> filteredList = new ArrayList<>();

        for (Integer i : list) {
            if (condition.test(i))
                filteredList.add(i);
        }
        return filteredList;
    }
}
