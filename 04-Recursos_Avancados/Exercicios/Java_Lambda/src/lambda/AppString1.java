package lambda;

public class AppString1 {
    public static void main(String[] args) {
        print(String::toUpperCase, "abc");
        print(s -> new StringBuilder(s).reverse().toString(), "abc");
    }

    private static void print(TextProvider textProvider){
        System.out.println(textProvider.getText());
    }

    private static void print(TextTransformer textTransformer, String text){
        System.out.println(textTransformer.transform(text));
    }
}
