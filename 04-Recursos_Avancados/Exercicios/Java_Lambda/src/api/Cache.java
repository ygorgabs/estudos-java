package api;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private final Map<String, Integer> map = new HashMap<>();

    public int get(String s){
        return map.computeIfAbsent(s, e -> {
            System.out.println("Computing for " + s);
            return e.length();
        });
    }
}
