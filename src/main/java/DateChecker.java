import java.util.Arrays;

public class DateChecker {

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public boolean has31Days(Month month) {
        if (month.equals(Month.FEBRUARY) ||
                month.equals(Month.APRIL) ||
                month.equals(Month.JUNE) ||
                month.equals(Month.SEPTEMBER) ||
                month.equals(Month.NOVEMBER)) {
            return false;
        }
        return true;
    }

}
