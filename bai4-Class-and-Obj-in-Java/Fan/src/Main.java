//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSPEED(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        System.out.println(fan1);
        Fan fan2 = new Fan();
        fan2.setSPEED(fan2.MEDIUM);
        System.out.println(fan2);
    }
}