package chat;

import lib.ChatConnection;

import java.util.Scanner;

public class Chat {
    public static void main(String[] ar) {
        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        ChatConnection chatConnection = new ChatConnection(name, false);
        chatConnection.run();
    }
}
