package ra.bt.bt1;

public class NumberGenerator implements Runnable {

    private int threadPriority;

    public NumberGenerator(int threadPriority) {
        this.threadPriority = threadPriority;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Nunber " + i + 1 + " Thread " + Thread.currentThread().getId() + " hashCode " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
