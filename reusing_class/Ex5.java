package tij4.reusing_class;

/**
 * Created by John on 3/13/2017.
 */
public class Ex5 {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A {
    A() {System.out.println("A");}
}
class B {
    B() {System.out.println("B");}
}
class C extends A {
    B b = new B();
}
