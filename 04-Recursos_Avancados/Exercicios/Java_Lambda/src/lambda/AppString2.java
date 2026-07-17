package lambda;

public class AppString2 {
    public static void main(String[] args) {

        print(
                s -> {
            char[] chars = s.toCharArray();
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < chars.length; i+= 2){
                sb.append(chars[i]);
            }
            return sb.toString();
        }, "java rocks!");
    }

    private static void print(TextTransformer textTransformer, String text){
        System.out.println(textTransformer.transform(text));
    }
}
