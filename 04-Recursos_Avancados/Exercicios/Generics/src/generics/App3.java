package generics;

public class App3 {
    public static void main(String[] args) {
        Buffer<String> b1 = new Buffer<>();
        b1.add("A");
        b1.add("B");
        b1.add("C");

        System.out.println(b1.remove().orElse(null));
        System.out.println(b1.remove().orElse(null));
        System.out.println(b1.remove().orElse(null));
        System.out.println(b1.remove().orElse(null));
    }
}
