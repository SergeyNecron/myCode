import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Connection {
    private String name;
    private Boolean t;

    Connection(String name, Boolean t) {
        this.name = name;
        this.t = t;
    }

    void run() {
        Socket socket;
        try {
            if (t) {
                ServerSocket ss = new ServerSocket(9999); // создаем сокет сервера c вышеуказанным портом
                System.out.println("Ожидание клиента");
                socket = ss.accept(); // ждём подключений
                System.out.println("Подключение выполнено");
            } else socket = new Socket("localhost", 9999); // создаем сокет используя IP-адрес и порт сервера.

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            Listener listener = new Listener(in);
            listener.start();
            out.writeUTF(name + "готов");
            while (true) {
                String message = scanner.nextLine();
                if (message.equals("exit")) {
                    listener.setStop();
                    break;
                } else
                    out.writeUTF(name + message);
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
