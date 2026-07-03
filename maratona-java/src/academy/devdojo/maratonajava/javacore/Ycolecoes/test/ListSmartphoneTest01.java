package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class ListSmartphoneTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("11111111", "Iphone");
        Smartphone s2 = new Smartphone("22222222", "Pixel");
        Smartphone s3 = new Smartphone("1ABC1ZTO", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for(Smartphone sm : smartphones){
            System.out.println(sm);
        }

        Smartphone s4 = new Smartphone("1ABC1ZTO", "Samsung");
        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);
    }
}
