package syncDemo;

public class DemoSynchronization {
    static int cnt = 0;
    private int nonStaticCnt = 0;
    private Object key = new Object();

    public static void main(String[] args) throws InterruptedException {
        DemoSynchronization demoSynchronization = new DemoSynchronization();
        Object key = new Object();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    Object key1 = new Object();
                    DemoSynchronization.count();
                    demoSynchronization.countNonStatic(key);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    Object key2 = new Object();
                    DemoSynchronization.count();
                    demoSynchronization.countNonStatic(key);
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(cnt);
        System.out.println(demoSynchronization.nonStaticCnt);


    }

    private synchronized static void count() {
        cnt++;
        synchronized (DemoSynchronization.class) {
            cnt++;
        }
    }

    private void countNonStatic(Object key) {
        synchronized (this) {
            nonStaticCnt++;
        }
    }
}
