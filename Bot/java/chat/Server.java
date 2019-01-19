package chat;

import lib.ChatConnection;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

public class Server {

    public static void main(String[] ar) {
        ArrayList<ChatConnection> chatConnections = new ArrayList();
        int maxSession = 100;
        String name = "Сессия ";
        ServerSocket ss = null; // создаем сокет сервера c вышеуказанным портом
        try {
            ss = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < maxSession; i++) {
            ChatConnection chatConnection = new ChatConnection(name + i + ": ", true, ss);
            chatConnection.start();
        }
    }
}
