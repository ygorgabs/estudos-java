package concurrency;

public class SharedCounter2 implements Runnable{
    private int contador;

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            contador++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getContador() {
        return contador;
    }
}
