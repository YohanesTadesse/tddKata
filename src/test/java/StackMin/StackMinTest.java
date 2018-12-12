package StackMin;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tadessey on 4/22/18.
 */
public class StackMinTest {

    StackMin stackMin = new StackMin();
    @Test
    public void shouldPopTheFirstElementWhileOneElementIsInThere() throws Exception {
        final int input = 1;
        stackMin.push(input);
        Assert.assertEquals(1, stackMin.pop());
    }

    @Test
    public void givenTWoNumbersShouldGiveMin() throws Exception {
        final int []input = {1, 2};
    }
}