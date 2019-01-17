import java.io.DataInputStream;
import java.io.IOException;

class Listener extends Thread {
    private DataInputStream in;
    private boolean stoped;

    Listener(DataInputStream in) {
        this.in = in;
    }

    void setStop() {
        stoped = true;
    }

    @Override
    public void run() {
        try {
            while (!stoped) {
                System.out.println(in.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}