package generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Buffer <T>{
    private final List<T> elements;

    //Construtor privado que inicializa o atributo
    private Buffer(LinkedList<T> elements){
        this.elements = elements;
    }

    //Construtor publico que não solicita nenhum parâmetro e chama o construtor privado
    public Buffer(){
        this(new LinkedList<>());
    }

    public void add(T element){
        this.elements.addLast(element);
    }

    public Optional<T> remove(){
        if(elements.isEmpty())
            return Optional.empty();

        return Optional.of(this.elements.removeLast());
    }

    public <K> Buffer<K> transform(Function<T,K> function){
        return new Buffer<>(new LinkedList<>(elements.stream().map(function).toList()));
    }
}
