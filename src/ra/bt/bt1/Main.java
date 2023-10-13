package ra.bt.bt1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator(Thread.MAX_PRIORITY);
        NumberGenerator numberGenerator2 = new NumberGenerator(Thread.MIN_PRIORITY);
        Thread t1 = new Thread(numberGenerator1);
        Thread t2 = new Thread(numberGenerator2);
        t1.start();
        t2.start();
    }
}
