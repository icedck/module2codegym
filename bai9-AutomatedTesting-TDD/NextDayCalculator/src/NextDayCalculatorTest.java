import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class NextDayCalculatorTest {
    @Test
    void testNextDay() {
        LocalDate today = LocalDate.now();
        String result = String.valueOf(NextDayCalculator.findNextDay(today));
        assertEquals("18/4/2025", result);
    }
    @Test
    void testNextDay2() {
        LocalDate today = LocalDate.now();
        String result = String.valueOf(NextDayCalculator.findNextDay(today));
        assertEquals("1/2/2018", result);
    }
}
