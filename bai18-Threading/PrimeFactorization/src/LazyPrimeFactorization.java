public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("LazyPrimeFactorization thread started: " + Thread.currentThread().getName());
        long n = 2;
        while(true) {
            if(isPrime(n)) {
                System.out.println("LazyPrimeFactorization: Found prime number: " + n);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e) {
                    System.out.println("LazyPrimeFactorization thread interrupted.");
                    break;
                }
            }
            n++;
        }
    }

    private boolean isPrime(long n) {
        if(n <= 1) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
