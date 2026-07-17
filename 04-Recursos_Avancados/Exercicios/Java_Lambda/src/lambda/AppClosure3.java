package lambda;

public class AppClosure3 {
    public static void main(String[] args) {
        NumberProvider p = new NumberProvider();
        p.setN(1);
        var n1 = p.provide();

        p.setN(10);
        var n2 = p.provide();

        p.setN(20);
        var n3 = p.provide();

        System.out.println(n1.get());
        System.out.println(n2.get());
        System.out.println(n3.get());
    }
}
