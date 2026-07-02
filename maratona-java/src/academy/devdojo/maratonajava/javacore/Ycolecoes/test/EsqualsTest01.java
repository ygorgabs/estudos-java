package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EsqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1ZTO", "Samsung");
        Smartphone s2 = new Smartphone("1ABC1ZTO", "Samsung");
        System.out.println(s1.equals(s2));
    }
}
