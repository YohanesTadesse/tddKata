package chapter_1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tadessey on 6/4/18.
 */
public class RemoveDuplicatesTest {

    @Test
    public void name() throws Exception {
        final int[] nums = {1,1,2};
        final RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeDuplicatesSolution(nums);

    }
}