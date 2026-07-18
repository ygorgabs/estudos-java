package api;

import java.util.ArrayList;
import java.util.Arrays;

public class AppRemoveIf1 {
    public static void main(String[] args) {
        var letters = new ArrayList<>(Arrays.asList("A", "b", "C", "d", "E", "f"));
        System.out.println(letters);
        letters.removeIf(e -> e.equals(e.toLowerCase()));
        System.out.println(letters);
    }
}
