package lambda;

public class Exercicio1 {
    public static void main(String[] args) {
        repeat(3, System.out::println);
    }

    public static void repeat(int n, CodeRepeat code){
        for(int i = 0; i < n; i++){
            code.execute(i);
        }
    }

}
