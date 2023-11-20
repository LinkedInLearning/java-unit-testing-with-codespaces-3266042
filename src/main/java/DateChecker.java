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

    private Month[] m31Days = {Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER};

    public Month[] get31Days() {
        return m31Days;
    }

    public boolean has31Days(Month month) {
        if(Arrays.asList(m31Days).contains(month)) {
            return true;
        } else {
            return false;
        }
    }

    


}
