package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatenarString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Execução String: " + (fim - inicio) + "ms");
        
        inicio = System.currentTimeMillis();
        concatenarStringBuilder(30_000);
        fim = System.currentTimeMillis();
        System.out.println("Execução StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatenarStringBuffer(30_000);
        fim = System.currentTimeMillis();
        System.out.println("Execução StringBuffer " + (fim - inicio) + "ms");
    }

    public static void concatenarString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
    public static void concatenarStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    public static void concatenarStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
