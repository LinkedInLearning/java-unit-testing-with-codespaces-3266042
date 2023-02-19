import java.util.Arrays;

public class HairSalon {

    private int haircutPrice = 30;
    private Calculator calculator = new Calculator();

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    private Day[] openingDays = {Day.MONDAY, Day.TUESDAY};

    // This method should return the openingDays array.
    public Day[] getOpeningDays() {
        return openingDays;
    }

    // This method should return true if the weekday passed in is present in the openingDays array.
    // If not it should return false.
    public boolean isOpen(Day weekDay) {
        if(Arrays.asList(openingDays).contains(weekDay)) {
            return true;
        } else {
            return false;
        }
    }

    public int getHaircutPrice() {
        return haircutPrice;
    }

    public int applyDiscount() {
        return calculator.divide(haircutPrice, 2) + 5;
    }
    
}
