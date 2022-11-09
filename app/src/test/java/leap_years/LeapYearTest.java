package leap_years;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LeapYearTest {
    @Test
    public void shouldBeDivisibleBy400Year2000() {
        Integer year = 2000;
        LeapYear leapYear = new LeapYear();
        assertTrue("Returns true if the year (2000) is divisible by 400", leapYear.check(year));
    }

    @Test
    public void shouldBeDivisibleBy400Year500() {
        Integer year = 500;
        LeapYear leapYear = new LeapYear();
        assertFalse("Returns false if the year is not divisible by 400", leapYear.check(year));
    }

    @Test
    public void shouldBeDivisibleBy400Year1600() {
        Integer year = 1600;
        LeapYear leapYear = new LeapYear();
        assertTrue("Returns true if the year (1600) is divisible by 400", leapYear.check(year));
    }

    @Test
    public void shouldReturnFalseIfDivisibleBy100NotBy400Year1500() {
        Integer year = 1500;
        LeapYear leapYear = new LeapYear();
        assertFalse("Returns false if year is divisible by 100 but not by 400", leapYear.check(year));
    }

    @Test
    public void shouldBeDivisibleBy4NotBy100Year2004() {
        Integer year = 2004;
        LeapYear leapYear = new LeapYear();
        assertTrue("Returns true if year is divisible by 4 but not by 100", leapYear.check(year));
    }

    @Test
    public void shouldBeDivisibleBy4NotBy100Year2008() {
        Integer year = 2008;
        LeapYear leapYear = new LeapYear();
        assertTrue("Returns true if year is divisible by 4 but not by 100", leapYear.check(year));
    }
    @Test
    public void shouldBeDivisibleBy4NotBy100Year2012() {
        Integer year = 2012;
        LeapYear leapYear = new LeapYear();
        assertTrue("Returns true if year is divisible by 4 but not by 100", leapYear.check(year));
    }

    @Test
    public void shouldBeDivisibleBy4Year2009() {
        Integer year = 2009;
        LeapYear leapYear = new LeapYear();
        assertFalse("Returns false if year is not divisible by 4", leapYear.check(year));
    }

    @Test
    public void shouldReturnArrayOfLeapYears() {
        Integer startYear = 2009;
        Integer endYear = 2016;
        ArrayList<Integer> expectedValue = new ArrayList<Integer>();
        expectedValue.add(2012);
        expectedValue.add(2016);

        LeapYear leapYear = new LeapYear();
        ArrayList<Integer> result = leapYear.checkRange(startYear, endYear);
        assertEquals("Returns an array of leap years between start and end years", expectedValue, result);
    }

    @Test
    public void shouldReturnClosestLeapYears_WhenProvidedLeapYear_ReturnsThatYear() {
        Integer year = 2008;
        Integer expectedValue = 2008;

        LeapYear leapYear = new LeapYear();
        Integer result = leapYear.getClosest(year);
        assertEquals("Checks whether it is a leap year and returns it", expectedValue, result);
    }

    @Test
    public void shouldReturnClosestLeapYears_WhenLeapYearIsBeforeGivenYear() {
        Integer year = 2009;
        Integer expectedValue = 2008;

        LeapYear leapYear = new LeapYear();
        Integer result = leapYear.getClosest(year);
        assertEquals("Checks the leap year before given year and returns it", expectedValue, result);
    }
}

