package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Ygor"; //String constant pool
        String nome2 = "Ygor";

        nome = nome.concat(" Gabriel");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Ygor");
        System.out.println(nome2 == nome3);
    }
}
