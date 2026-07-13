package generics;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        List<? extends Closeable> objs = new ArrayList<>(List.of(new Scanner(System.in), new Scanner(System.in), new Scanner(System.in)));
        closeAll(objs);
    }

    public static <T> void closeAll(List<? extends Closeable> objetos){
        for (Closeable objeto : objetos) {
            try{
                objeto.close();
                System.out.println("Objeto fechado");
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }
}
