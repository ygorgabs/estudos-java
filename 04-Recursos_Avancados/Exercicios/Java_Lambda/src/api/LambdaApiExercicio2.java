package api;

import java.util.HashMap;
import java.util.Map;

public class LambdaApiExercicio2 {
    public static void main(String[] args) {
        Cache cache = new Cache();
        System.out.println(cache.get("house"));
        System.out.println(cache.get("house"));
        System.out.println(cache.get("house"));
        System.out.println(cache.get("house"));

        System.out.println(cache.get("car"));
        System.out.println(cache.get("car"));
        System.out.println(cache.get("car"));
    }
}
