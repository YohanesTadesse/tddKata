import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

/**
 * Created by tadessey on 2/26/18.
 */
public class RemoveDuplicateWithOrderOneAndNoExtraMemoryTest {

    @Test
    public void shouldRemoveDuplicate() throws Exception {
        final int[] input = {1, 1, 2};
        final int[] expected = {1,2};
        final int[] actual = RemoveDuplicateWithOrderOneAndNoExtraMemory.deDup(input);
        assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldRemoveDuplicateTwo() throws Exception {
        final int[] input = {1, 1, 1, 2};
        final int[] expected = {1,2};
        final int[] actual = RemoveDuplicateWithOrderOneAndNoExtraMemory.deDup(input);
        assertArrayEquals(actual, expected);
    }
}