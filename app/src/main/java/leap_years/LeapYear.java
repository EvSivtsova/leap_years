package leap_years;

import java.util.ArrayList;
import java.lang.Math.*;

public class LeapYear {

    public Boolean check(Integer year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Integer> checkRange(Integer startYear, Integer endYear) {
        ArrayList<Integer> yearRange = new ArrayList<Integer>();
        for (Integer year = startYear; year <= endYear; year++) {
            if (this.check(year)) {
                yearRange.add(year);
            }
        }
        return yearRange;
    }

    public Integer getClosest(Integer year) {
        if (this.check(year)) {
            return year;
        }
        return null;
    }
}