import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class InterleaveTest {

    private Interleave interleave;

    @Before
    public void setUp() throws Exception {
        interleave = new Interleave();
    }

    @Test
    public void interleave() {
        final String s1 = "abbcddef";
        final String s2 = "accbbbcd";
        final String s3 = "abbcddefaccbbbdc";

        assertFalse(interleave.isInterleave(s1, s2, s3));
    }
}
