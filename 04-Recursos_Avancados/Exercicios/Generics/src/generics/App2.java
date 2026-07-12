package generics;

public class App2 {
    public static void main(String[] args) {
        HolderG<String> h1 = new HolderG<>("Hello");
        String obj1 = h1.getObj();
        System.out.println(obj1);

        HolderG<Integer> h2 = new HolderG<>(10);
        Integer obj2 = h2.getObj();
        System.out.println(obj2);
    }
}
