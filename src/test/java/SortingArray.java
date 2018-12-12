import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;

/**
 * Created by tadessey on 6/12/17.
 */
public class SortingArray {

    @Test
    public void givenNullReturnNUll() {
       Assert.assertEquals(null, sortArray(null));
    }

    @Test
    public void givenEmptyInputReturnEmpty() {
        int[] input = {};
        Assert.assertEquals(input, sortArray(input));
    }

    @Test
    public void oneItemShouldReturnItSelf() {
        final int[] input = {1};
        Assert.assertEquals(input, sortArray(input));
    }

    @Test
    public void givenSortedElementsReturnItSelf() {
        int[] input = {1, 2};
        int[] sorted = sortArray(input);
        for(int i = 0; i < sorted.length; i++){
            Assert.assertEquals(input[i], sorted[i]);
        }
    }

    @Test
    public void givenUnSortedElementReturnBackSorted() {
        int input[] = new int[10];
        for (int i = 0; i < 10; i++){
            input[i] = (int)((Math.random() * 100) * (Math.random() * 100));
        }
        int[] sorted = sortArray(input);
        Arrays.sort(input);
        for(int i = 0; i < sorted.length; i++){
            Assert.assertEquals(input[i], sorted[i]);
            System.out.println(input[i]+" "+sorted[i]);
        }

    }



    public int[] sortArray(final int[] input) {
        return input;
    }

}
