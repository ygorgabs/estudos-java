package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest03 {
    private String name = "Ygor";

    static class Nested{
        String lastname = "Silva";
        void print(){
            System.out.println(new OuterClassTest03().name + " " + lastname);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
