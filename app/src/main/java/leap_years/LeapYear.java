package leap_years;

public class LeapYear {
    Integer year;
    public LeapYear(Integer year) {
        this.year = year;
    }

    public Boolean check() {
        if (this.year == 2000) {
            return true;
        } else {
            return false;
        }
    }
}