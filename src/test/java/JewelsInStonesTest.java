import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

/**
 * Created by tadessey on 3/30/18.
 */
public class JewelsInStonesTest {
    JewelsInStones s = new JewelsInStones();

    @Test
    public void name() throws Exception {
        assertEquals(s.hammingDistance(1, 4), 2);
    }

    @Test
    public void numJewelsInStones() throws Exception {
        assertEquals(s.numJewelsInStones("aA", "aAAbbB"), 3);
    }

    @Test
    public void judgeCircle() throws Exception {
        assertTrue(s.judgeCircle("LR"));
        assertTrue(s.judgeCircle("UD"));
        assertFalse(s.judgeCircle("LD"));
        assertFalse(s.judgeCircle("LDRRLRUULR"));
        assertFalse(s.judgeCircle("LDRRLRUULR"));
    }

    @Test
    public void selfDividingNumber() throws Exception {
        assertThat(s.selfDividingNumbers(1, 22), containsInAnyOrder(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22));
    }

    @Test
    public void arrayPairSum() throws Exception {
        final int[] input = {1,4,3,2};
        assertEquals(s.arrayPairSum(input), 4);
    }

    @Test
    public void shortestToChar() throws Exception {
        String string = "loveleetcode";
        char c = 'e';
        List<Integer> expected = Arrays.asList(3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0);
        int[] ints = s.shortestToChar(string, c);
        IntStream.of(ints).forEach(x -> System.out.print(x + ", "));
        assertThat(expected, containsInAnyOrder(ints));
    }

    @Test
    public void maxIncreaseKeepingSkyline() throws Exception {
        int[][] myInput = {{1,2, 3}, {1,2, 3}};
        s.maxIncreaseKeepingSkyline(myInput);
    }
}
