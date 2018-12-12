package DigitCount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitCountTest {
    private DigitCount count;

    @Before
    public void setUp() throws Exception {
         count = new DigitCount();
    }

    @Test
    public void name() {
        final int result = count.digitCounts(1, 12);
        final int expectation = 5;
        assertEquals(result, expectation);
    }

    @Test
    public void name2() {
        final int actual = count.digitCountsLoop(1, 12);
        final int expected = 5;
        assertEquals(expected, actual);

    }
}