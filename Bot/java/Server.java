import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] ar) {

        try {
            ServerSocket ss = new ServerSocket(9999); // создаем сокет сервера c вышеуказанным портом
            System.out.println("Ожидание клиента");

            Socket socket = ss.accept(); // ждём подключений
            System.out.println("Подключение выполнено");

            // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиенту.
            // Конвертируем потоки в тип Data, чтоб легче обрабатывать текстовые сообщения.
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Клиент : " + in.readUTF());
            while (true) {
                System.out.println("Клиент : " + in.readUTF());
                out.writeUTF("ИИ : " + reader.readLine()); // отсылаем клиенту ответ.
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
