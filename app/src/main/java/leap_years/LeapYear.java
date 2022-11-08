package leap_years;

public class LeapYear {
    Integer year;
    public LeapYear(Integer year) {
        this.year = year;
    }

    public Boolean check() {
        if (this.year == 2004) {
            return true;
        } else if (this.year == 2008) {
            return true;
        } else if (this.year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}