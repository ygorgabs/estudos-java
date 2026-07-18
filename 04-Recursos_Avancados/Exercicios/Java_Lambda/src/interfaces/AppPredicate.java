package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppPredicate {
    public static void main(String[] args) {
        var list = List.of("A", "B", "C", "D", "AA", "AB", "AC", "AD");
        System.out.println(filter(list, s -> s.length() == 1));
    }

    private static List<String> filter(List<String> list, Predicate<String> predicate){
        var newList = new ArrayList<String>();
        for (String e : list) {
            if (predicate.test(e)) {
                newList.add(e);
            }
        }
        return newList;
    }
}
