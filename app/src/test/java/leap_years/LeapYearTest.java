package leap_years;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LeapYearTest {
    @Test
    public void shouldDivideBy400() {
        Integer year = 2000;
        LeapYear leapYear = new LeapYear(year);
        assertTrue("Returns true if the year is divisible by 400", leapYear.check());
    }
}
