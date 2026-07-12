package generics;

public class HolderG <T> {
    private final T obj;

    public HolderG(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
