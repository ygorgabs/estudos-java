package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.List;

class ThreadSafeNames{
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name){
        this.names.add(name);
    }

    public synchronized void removeFirst(){
        if(!names.isEmpty()){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames names = new ThreadSafeNames();
        names.add("Itadori");
        Runnable r = names::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
