package bot;

import lib.ChatConnection;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] ar) {

        String name = "ИИ: ";
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(9999);// создаем сокет сервера c вышеуказанным портом
        } catch (IOException e) {
            e.printStackTrace();
        }
        ChatConnection chatConnection = new ChatConnection(name, true, ss);
        chatConnection.run();
    }
}
