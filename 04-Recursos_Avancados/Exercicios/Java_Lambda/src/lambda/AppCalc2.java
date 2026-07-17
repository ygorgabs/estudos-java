package lambda;

public class AppCalc2 {
    public static void main(String[] args) {
        run((n1, n2) ->  n1 + n2);
        run((n1, n2) ->  n1 * n2);
    }

    private static void run(Operation operation){
        Integer r = operation.calculate(5, 4);
        System.out.println(r);
    }
}
