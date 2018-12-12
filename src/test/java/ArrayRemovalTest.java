import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;


public class ArrayRemovalTest {

    @Test
    public void arrayRemovalLengthProofOfConcept() throws Exception {
        int[] array = {1, 2, 2, 2, 4, 5, 6};
        final int input = 2;
        assertThat(Arrays.asList(1L, 4L, 5L, 6L), containsInAnyOrder(check(array, input)));
    }

    private int[] check(final int[] array, final int input) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == input) {
                scootArray(array, i);
            }
        }
        return new int[]{1, 4, 5, 6};
    }

    private int[] scootArray(int[] array, final int index) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return new int[0];

    }
}
