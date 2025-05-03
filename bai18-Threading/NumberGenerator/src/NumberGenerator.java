public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + " - Thread: " + Thread.currentThread().getName() +
                        ", Number: " + i + ", HashCode: " + this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " - Thread " + Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(name + " - Thread " + Thread.currentThread().getName() + " run is over.");
    }
}
