package generics;

public class App1 {
    public static void main(String[] args) {
        Holder h1 = new Holder("Hello");
        String obj1 = (String) h1.getObj();
        System.out.println(obj1);

        Holder h2 = new Holder(10);
        Integer obj2 = (Integer) h2.getObj();
        System.out.println(obj2);
    }
}
