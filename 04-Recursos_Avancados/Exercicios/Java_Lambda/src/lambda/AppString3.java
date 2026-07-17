package lambda;

public class AppString3 {
    public static void main(String[] args) {

    }

    private static void transformAndPrint(TextTransformer textTransformer, String text){
        System.out.println(textTransformer.transform(text));
    }
}
