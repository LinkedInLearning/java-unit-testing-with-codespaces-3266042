import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] expected = new String[]{"Monday", "Tuesday"};

        String[] actual = hairSalon.getOpeningDays();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        assertTrue(hairSalon.isOpen("Monday"));
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        assertFalse(hairSalon.isOpen("Wednesday"));
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> hairSalon.isOpen("Hello"));

        String expected = "The weekday argument must end in the letters 'day'";

        String actual = exception.getMessage();

        assertEquals(expected, actual);
    }

}