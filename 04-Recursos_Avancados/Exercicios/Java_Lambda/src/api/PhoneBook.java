package api;

import java.util.Map;
import java.util.Optional;

public class PhoneBook {
    private final Map<String, Integer> contacts;

    public PhoneBook(Map<String, Integer> contacts) {
        this.contacts = contacts;
    }

    public Optional<Integer> findByName(String name){
//        Optional<Integer> telephone = Optional.empty();
//        for (Map.Entry<String, Integer> entry : contacts.entrySet()) {
//            if(entry.getKey().equals(name)) {
//                System.out.println(entry.getValue());
//                telephone = Optional.of(entry.getValue());
//            }
//        }
//        telephone.orElseThrow(IllegalArgumentException::new);
//        return telephone;
        return Optional.ofNullable(contacts.get(name));
    }
}
