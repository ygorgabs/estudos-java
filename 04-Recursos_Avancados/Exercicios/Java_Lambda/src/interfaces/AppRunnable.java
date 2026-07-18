package interfaces;

public class AppRunnable {
    public static void main(String[] args) {
        execute(() -> System.out.println("Hi!!"));
        execute(() -> {
            for(int i = 0; i < 10; i++){
                System.out.println(i);
            }
        });
    }

    public  static void execute(Runnable runnable){
        runnable.run();
    }
}
