package api;

import java.util.Map;
import java.util.Optional;

public class People {
    private final Map<Integer, String> map;

    public People(Map<Integer, String> map) {
        this.map = map;
    }

    public Optional<String> getNameById(int id){
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(id)) {
                return Optional.of(entry.getValue());
            }
        }
        return Optional.empty();
    }
}
