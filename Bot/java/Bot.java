import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import static java.lang.Thread.sleep;

public class Bot {
    public static void main(String[] ar) {

        try {

            Socket socket = new Socket("localhost", 9999); // создаем сокет используя IP-адрес и порт сервера.

            System.out.println("Загрузка ИИ");
            System.out.print("1% ");
            for (int i = 0; i < 50; i++) {
                System.out.print("=");
                sleep(100);
            }
            System.out.println("100%");

            /// Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиенту.
            // Конвертируем потоки в тип Data, чтоб легче обрабатывать текстовые сообщения.
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            // Создаем поток для чтения с клавиатуры.
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Я готов, спрашивай");
            out.writeUTF("клиент готов");
            while (true) {
                String message = reader.readLine();
                if (!message.equals("")) {
                    out.writeUTF(message);
                    System.out.println("ИИ: Думает..");
                    System.out.println(in.readUTF());
                } else
                    System.out.println("Не вижу вопроса");
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
