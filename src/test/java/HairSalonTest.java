import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        HairSalon.Day[] expected = new HairSalon.Day[]{HairSalon.Day.MONDAY, HairSalon.Day.TUESDAY};

        HairSalon.Day[] actual = hairSalon.getOpeningDays();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        assertTrue(hairSalon.isOpen(HairSalon.Day.MONDAY));
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        assertFalse(hairSalon.isOpen(HairSalon.Day.WEDNESDAY));
    }

    @Test
    public void testNull() {
        assertFalse(hairSalon.isOpen(null));
    }

    @Test
    public void testHalfPriceDiscount() {
        int expected = 20;

        int actual = hairSalon.applyDiscount();

        Calculator calculator = new Calculator();
        assumeTrue(calculator.divide(hairSalon.getHaircutPrice(), 2) == 15);

        assertEquals(expected, actual);
    }

}