package generics;

public class App10 {
    public static void main(String[] args) {
        Matrix<Integer> m = new Matrix<>();
        m.set(0, 0, 33);
        m.set(0, 1, 2);
        m.set(0, 2, 12);
        m.set(1, 0, 41);
        m.set(1, 1, 54);
        m.set(1, 2, 62);
        m.set(2, 0, 87);
        m.set(2, 1, 37);
        m.set(2, 2, 9);

        m.print();
    }
}
