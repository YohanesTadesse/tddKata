import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeapYearTest {

    @Test
    public void givenZeroShouldReturnTrue() throws Exception {
        verify(LeapYear.isLeapYear(0), true);
    }

    @Test
    public void shouldReturnTrueGiven2000() throws Exception {
        verify(LeapYear.isLeapYear(2000), true);
    }

    @Test
    public void shouldReturnFalseForNonLeapYears() throws Exception {
        verify(LeapYear.isLeapYear(1700), false);
        verify(LeapYear.isLeapYear(2018), false);
        verify(LeapYear.isLeapYear(2019), false);
        verify(LeapYear.isLeapYear(1800), false);
        verify(LeapYear.isLeapYear(2100), false);
    }

    @Test
    public void shouldReturnTrueFor2008() throws Exception {
        verify(LeapYear.isLeapYear(2008), true);
    }

    private void verify(final boolean expected, final boolean actualResult) {
        assertEquals(expected, actualResult);
    }
}
