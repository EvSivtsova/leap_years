package leap_years;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LeapYearTest {
    @Test
    public void shouldBeDivisibleBy400Year2000() {
        Integer year = 2000;
        LeapYear leapYear = new LeapYear(year);
        assertTrue("Returns true if the year (2000) is divisible by 400", leapYear.check());
    }

    @Test
    public void shouldBeDivisibleBy400Year500() {
        Integer year = 500;
        LeapYear leapYear = new LeapYear(year);
        assertFalse("Returns false if the year is not divisible by 400", leapYear.check());
    }

    @Test
    public void shouldBeDivisibleBy400Year1600() {
        Integer year = 1600;
        LeapYear leapYear = new LeapYear(year);
        assertTrue("Returns true if the year (1600) is divisible by 400", leapYear.check());
    }

    @Test
    public void shouldReturnFalseIfDivisibleBy100NotBy400Year1500() {
        Integer year = 1500;
        LeapYear leapYear = new LeapYear(year);
        assertFalse("Returns false if year is divisible by 100 but not by 400", leapYear.check());
    }

    @Test
    public void shouldBeDivisibleBy4NotBy100Year2004() {
        Integer year = 2004;
        LeapYear leapYear = new LeapYear(year);
        assertTrue("Returns true if year is divisible by 4 but not by 100", leapYear.check());
    }

    @Test
    public void shouldBeDivisibleBy4NotBy100Year2008() {
        Integer year = 2008;
        LeapYear leapYear = new LeapYear(year);
        assertTrue("Returns true if year is divisible by 4 but not by 100", leapYear.check());
    }
    @Test
    public void shouldBeDivisibleBy4NotBy100Year2012() {
        Integer year = 2012;
        LeapYear leapYear = new LeapYear(year);
        assertTrue("Returns true if year is divisible by 4 but not by 100", leapYear.check());
    }

    @Test
    public void shouldBeDivisibleBy4Year2009() {
        Integer year = 2009;
        LeapYear leapYear = new LeapYear(year);
        assertFalse("Returns false if year is not divisible by 4", leapYear.check());
    }
}

