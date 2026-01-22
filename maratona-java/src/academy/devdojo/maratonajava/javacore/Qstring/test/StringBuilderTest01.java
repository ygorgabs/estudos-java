package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Ygor Gabriel";
        nome.concat(" Silva");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Ygor Gabriel");

        System.out.println(sb);
        sb.append(" Silva");
        System.out.println(sb);
    }
}
