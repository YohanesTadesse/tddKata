package kthlargestelemet;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class KthLargestElementTest {
    private KthLargestElement kthLargestElement;

    @Before
    public void setUp() {
        kthLargestElement = new KthLargestElement();
    }

    @Test
    public void shouldReturn3rdLargestElement() {
        int [] arr = new int[] {9, 3, 2, 4, 8};

        final int actual = kthLargestElement.kthLargestElement(3, arr);

        assertThat(actual, is(4));
    }

    @Test
    public void shouldReturn10thLargestElement() {
        int [] arr = new int[] {9, 3, 2, 4, 8, 1, 6, 5, 7, 19};

        final int actual = kthLargestElement.kthLargestElement(10, arr);

        assertThat(actual, is(1));
    }
}
