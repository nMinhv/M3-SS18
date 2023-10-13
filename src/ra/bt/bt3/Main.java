package ra.bt.bt3;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        Thread tOp  = new Thread(optimizedPrimeFactorization);
        Thread tLz  = new Thread(lazyPrimeFactorization);
        tOp.start();
        tLz.start();
    }
}
