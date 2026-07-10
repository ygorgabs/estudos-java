package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("B");
        fila.add("C");
        fila.add("A");

        for (String s : fila) {
            System.out.println(s);
        }

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
