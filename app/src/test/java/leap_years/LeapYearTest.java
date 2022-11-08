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
}
