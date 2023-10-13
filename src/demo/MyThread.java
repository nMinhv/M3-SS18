package demo;

public class MyThread extends Thread {
    @Override
    public void run() {
        byte b = 0;
        while (b < 10) {
            System.out.println(this.getId() + "|" + System.currentTimeMillis() + b);
            b++;
        }
    }
}
