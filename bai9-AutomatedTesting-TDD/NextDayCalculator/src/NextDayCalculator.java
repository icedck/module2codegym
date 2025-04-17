import java.time.LocalDate;

public class NextDayCalculator {

    public static LocalDate findNextDay(LocalDate date) {
        LocalDate today = date.plusDays(1);
        return today;
    }
}
