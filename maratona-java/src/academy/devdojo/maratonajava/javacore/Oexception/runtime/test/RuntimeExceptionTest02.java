package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        try{
            System.out.println(divisao(1,0));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    private static int divisao(int a, int b){
       if(b == 0) throw new IllegalArgumentException("Não é possível Divisão por 0");
       return a/b;
    }
}
