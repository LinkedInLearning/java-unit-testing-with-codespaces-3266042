import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

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

    @ParameterizedTest
    @EnumSource(value = HairSalon.Day.class, names = { "MONDAY", "TUESDAY" })
    public void testSalonIsOpenOnMonday(HairSalon.Day day) {
        assertTrue(hairSalon.isOpen(day));
    }

    @ParameterizedTest
    @EnumSource(value = HairSalon.Day.class, names = { "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" })
    public void testSalonIsClosed(HairSalon.Day day) {
        assertFalse(hairSalon.isOpen(day));
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