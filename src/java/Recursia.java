public class Recursia {
    private static int fact(int i) {
        return i == 1 ? 1 : fact(i - 1) * i;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
