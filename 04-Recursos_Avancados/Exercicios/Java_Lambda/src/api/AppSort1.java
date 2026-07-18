package api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppSort1 {
    public static void main(String[] args) {
        var letters = new ArrayList<>(List.of('C', 'B', 'E', 'F', 'A', 'D'));
        System.out.println(letters);
        letters.sort(Comparator.naturalOrder());
        System.out.println(letters);
        letters.sort(Comparator.reverseOrder());
        System.out.println(letters);
    }
}
