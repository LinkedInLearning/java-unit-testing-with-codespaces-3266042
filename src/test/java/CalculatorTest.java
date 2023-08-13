import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 3;

        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 2;
        int actual = calculator.subtract(3, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 6;
        int actual = calculator.multiply(3, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 4;
        int actual = calculator.divide(12, 3);
        assertEquals(expected, actual);
    }

}
