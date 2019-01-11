public class Deadlock {

    class A {
    }

    class B {
    }

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        A a = deadlock.new A();
        B b = deadlock.new B();
        Runnable block1 = () -> {
            synchronized (a) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("1 захватил а");
                synchronized (b) {
                    System.out.println("1 захватил b");
                }
            }
        };
        Runnable block2 = () -> {
            synchronized (b) {
                System.out.println("2 захватил b");
                synchronized (a) {
                    System.out.println("2 захватил a");
                }
            }
        };

        new Thread(block1).start();
        new Thread(block2).start();
    }
}
