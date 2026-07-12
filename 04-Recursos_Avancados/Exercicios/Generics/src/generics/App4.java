package generics;

public class App4 {
    public static void main(String[] args) {
        Buffer<Integer> b = new Buffer<>();
        b.add(10);
        b.add(20);

        Buffer<String> b2 = b.transform(e -> "**"+e+"**");
        System.out.println(b2.remove().orElseThrow());
        System.out.println(b2.remove().orElseThrow());
    }
}
