package leap_years;

import java.util.ArrayList;

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
        if (Math.abs(this.getClosestLeapYearBeforeGivenYear(year) - year) < Math.abs(this.getClosestLeapYearAfterGivenYear(year) - year) ) {
            return this.getClosestLeapYearBeforeGivenYear(year);
        }
        return  this.getClosestLeapYearAfterGivenYear(year);
    }


    private Integer getClosestLeapYearAfterGivenYear(Integer year) {
        Integer leapYear = null;
        for (Integer yearToCheck = year; yearToCheck < year + 4; yearToCheck++) {
            if (this.check(yearToCheck)) {
                leapYear = yearToCheck;
            }
        }
        return leapYear;
    }

    private Integer getClosestLeapYearBeforeGivenYear(Integer year) {
        Integer leapYear = null;
        for (Integer yearToCheck = year; yearToCheck > year - 4; yearToCheck--) {
            if (this.check(yearToCheck)) {
                leapYear = yearToCheck;
            }
        }
        return leapYear;
    }
}