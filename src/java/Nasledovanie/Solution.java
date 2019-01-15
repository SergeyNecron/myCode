package Nasledovanie;

public class Solution extends C {
    private A a = new A() {
        { //у анонимных классов нет своих конструкторов, но что-то можно сделать в блоке инициализации класса
            value = "Y";
            System.out.print(value);
        }
    };

    private Solution() {
        System.out.print("S");
    }

    public static void main(String[] args) {
        new Solution();
    }

    private class A {
        String value = "A";

        A() {
            System.out.print(value);
        }
    }
}
