package generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Buffer <T>{
    private final List<T> elements = new LinkedList<>();

    public void add(T element){
        this.elements.addLast(element);
    }

    public Optional<T> remove(){
        if(elements.isEmpty())
            return Optional.empty();

        return Optional.of(this.elements.removeLast());
    }
}
