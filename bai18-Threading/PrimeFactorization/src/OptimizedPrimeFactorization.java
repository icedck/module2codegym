public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("OptimizedPrimeFactorization thread started: " + Thread.currentThread().getName());
        long n =2;
        while(true) {
            if(isPrime(n)) {
                System.out.println("OptimizedPrimeFactorization: Found prime number: " + n);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e) {
                    System.out.println("OptimizedPrimeFactorization thread interrupted.");
                    break;
                }
            }
        }
    }

    public boolean isPrime(long n) {
        if(n <= 1) return false;
        if (n<=3) return true;
        if (n%2==0 || n%3==0) return false;
        for(long i = 5; i*i <= n; i+=6) {
            if(n%i==0 || n %(i+2)==0) return false;
        }
        return true;
    }
}
