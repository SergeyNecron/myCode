package Nasledovanie;

public interface JustAnInterface {
    B B = new B();

    class B extends C {
        B() {
            System.out.print("B");
        }
    }
}