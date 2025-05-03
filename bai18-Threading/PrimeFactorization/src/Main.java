//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimized = new OptimizedPrimeFactorization();

        Thread threadLazy = new Thread(lazy, "Lazy Thread");
        Thread threadOptimized = new Thread(optimized, "Optimized Thread");

        threadLazy.start();
        threadOptimized.start();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is interrupting other threads...");
        threadLazy.interrupt();
        threadOptimized.interrupt();

        System.out.println("Main thread finished.");
    }
}