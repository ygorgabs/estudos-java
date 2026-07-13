package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest01 {
    private String name = "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
