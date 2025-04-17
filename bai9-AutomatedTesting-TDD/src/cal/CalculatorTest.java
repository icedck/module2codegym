package cal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int x = 1;
        int y = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }
}
