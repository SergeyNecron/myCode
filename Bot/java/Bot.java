public class Bot {
    public static void main(String[] ar) {
        System.out.println("Загрузка ИИ");
        System.out.print("2% ");
        for (int i = 1; i < 50; i++) {
            System.out.print("=");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("100%");
        System.out.println("Я готов, спрашивай");
        String name = "Клиент ";
        Connection connection = new Connection(name, false);
        connection.run();
    }
}
