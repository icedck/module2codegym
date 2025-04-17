import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        System.out.println(nextDayCalculator.findNextDay(today));

    }
}