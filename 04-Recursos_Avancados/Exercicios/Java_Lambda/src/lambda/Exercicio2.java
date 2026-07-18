package lambda;

public class Exercicio2 {
    public static void main(String[] args) {
        run("Esse codigo não é null", System.out::println, () -> System.out.println("Objeto nulo"));
        run(null, System.out::println, () -> System.out.println("Objeto nulo"));
    }

    private static void run(String s, StringNotNull codeIfNotNull, StringNull codeIfNull){
        if(s == null){
            codeIfNull.execute();
        }else {
            codeIfNotNull.execute(s);
        }
    }

    @FunctionalInterface
    interface StringNull{
        void execute();
    }

    @FunctionalInterface
    interface StringNotNull{
        void execute(String s);
    }
}
