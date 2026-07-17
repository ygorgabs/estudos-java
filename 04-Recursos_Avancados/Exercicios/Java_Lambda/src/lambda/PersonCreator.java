package lambda;

@FunctionalInterface
public interface PersonCreator {
    Person create(String name);
}
