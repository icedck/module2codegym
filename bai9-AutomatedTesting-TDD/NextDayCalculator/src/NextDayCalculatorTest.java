import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class NextDayCalculatorTest {
    @Test
    void testNextDay0() {
        LocalDate today = LocalDate.of(2018, 1, 1);
        LocalDate result = NextDayCalculator.findNextDay(today);
        assertEquals(LocalDate.of(2018, 1, 2), result);
    }

    @Test
    void testNextDay1() {
        LocalDate today = LocalDate.of(2018, 1, 31);
        LocalDate result = NextDayCalculator.findNextDay(today);
        assertEquals(LocalDate.of(2018, 2, 1), result);
    }

    @Test
    void testNextDay2() {
        LocalDate today = LocalDate.of(2018, 4, 30);
        LocalDate result = NextDayCalculator.findNextDay(today);
        assertEquals(LocalDate.of(2018, 5, 1), result);
    }

    @Test
    void testNextDay3() {
        LocalDate today = LocalDate.of(2018, 2, 28);
        LocalDate result = NextDayCalculator.findNextDay(today);
        assertEquals(LocalDate.of(2018, 3, 1), result);
    }

    @Test
    void testNextDay4() {
        LocalDate today = LocalDate.of(2020, 2, 29);
        LocalDate result = NextDayCalculator.findNextDay(today);
        assertEquals(LocalDate.of(2020, 3, 1), result);
    }

    @Test
    void testNextDay5() {
        LocalDate today = LocalDate.of(2018, 12, 31);
        LocalDate result = NextDayCalculator.findNextDay(today);
        assertEquals(LocalDate.of(2019, 1, 1), result);
    }
}
