package Nasledovanie;

class C implements JustAnInterface {
    C() {
        System.out.print("C");
        B localB = B;
    }
}