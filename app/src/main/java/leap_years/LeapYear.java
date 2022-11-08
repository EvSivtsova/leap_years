package leap_years;

public class LeapYear {
    Integer year;
    public LeapYear(Integer year) {
        this.year = year;
    }

    public Boolean check() {
        if (this.year % 4 == 0 && this.year % 100 != 0) {
            return true;
        } else if (this.year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}