package lambda;

@FunctionalInterface
public interface TextTransformer {
    String transform(String text);
}
