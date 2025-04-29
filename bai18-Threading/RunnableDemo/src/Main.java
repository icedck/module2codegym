//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");
        RunnableDemo rd1 = new RunnableDemo("Thread-1-HR-Database");
        rd1.start();

        RunnableDemo rd2 = new RunnableDemo("Thread-2-Send-Email");
        rd2.start();

        System.out.println("Main thread stopped!!! ");
    }
}