package lambda;

public class AppString4 {
    public static void main(String[] args) {
        transformAndPrint(String::valueOf, 100);
    }

    private static void transformAndPrint(NumberTransformer numberTransformer, int number){
        System.out.println(numberTransformer.tranform(number));
    }
}
