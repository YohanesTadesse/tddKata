package kthlargestelemet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestElementTest {
    KthLargestElement  k;

    @Before
    public void setUp() throws Exception {
        k = new KthLargestElement();
    }

    @Test
    public void name() {
        int [] arr = new int[] {9,3,2,4,8};
        System.out.println(k.kthLargestElement(3, arr));
    }

    @Test
    public void interleave() {
        final String s1 = "abbcddef";
        final String s2 = "accbbbcd";
        final String s3 = "abbcddefaccbbbdc";
        assertFalse(k.isInterleave2(s1, s2, s3));
    }
}
