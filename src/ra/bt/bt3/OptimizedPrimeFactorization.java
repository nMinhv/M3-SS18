package ra.bt.bt3;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i<100; i++) {
            if (isPrime(i)) {
                System.out.println("Prime num op: " + i);
            }
        }
    }

    private boolean isPrime(int i) {
        if (i == 2) {
            return true;
        }
        if (i <= 1) {
            return false;
        }
        for (int j = 2;  j * j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
