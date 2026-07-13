package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest02 {
    private String name = "Midoriya";

    void print(){
        class LocalClass{
            public void printLocal(){
                System.out.println(name);
            }
        }
        new LocalClass().printLocal();
    }
    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        outer.print();
    }
}
