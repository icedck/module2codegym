//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator("Generator 1");
        NumberGenerator generator2 = new NumberGenerator("Generator 2");

        Thread thread1 = new Thread(generator1, "Thread 1");
        Thread thread2 = new Thread(generator2, "Thread 2");

        //Đặt độ ưu tiên cho thread
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        //In ra độ ưu tiên của các Thread
        System.out.println("Priority of " + thread1.getName() + ": " + thread1.getPriority());
        System.out.println("Priority of " + thread2.getName() + ": " + thread2.getPriority());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread run is over.");
    }
}