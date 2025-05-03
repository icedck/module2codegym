//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
//        evenThread.start();

        try {
            oddThread.join();
            evenThread.start();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread is over.");
    }
}