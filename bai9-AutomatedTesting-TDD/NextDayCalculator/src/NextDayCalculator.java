import java.time.LocalDate;

public class NextDayCalculator {

    public static LocalDate findNextDay(LocalDate date) {
        LocalDate today = LocalDate.now();
        date = today.plusDays(1);
        return date;
    }
}
