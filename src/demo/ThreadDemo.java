package demo;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread();
        Thread myThread2 = new MyThread();
        myThread.start();
        myThread.join();
        myThread2.start();
        myThread2.join();
        byte b = 0;
        while (b < 10) {
            System.out.println("Main thread | " + System.currentTimeMillis());
            b++;
        }
    }
}
