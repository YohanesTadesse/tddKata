import org.junit.Assert;
import org.junit.Test;


public class BinaryChopBinary {

    @Test
    public void givenNullArrayReturnsNegative() {
        Assert.assertEquals(-1, chop(1, null));
    }

    @Test
    public void givenEmptyArrayReturnNegative() {
        Assert.assertEquals(-1,chop(1, new int[]{}));
    }

    @Test
    public void givenOneElementReturnsResult() {
        compare(1, 1, new int[]{1});
        compare(-1,1, new int[]{2});
    }

    @Test
    public void givenTwoElementReturnsResult() {
        compare(1,1, new int[]{1,2});
        compare(-1,1, new int[]{2,3});
    }

    @Test
    public void givenRandomSizedArrayReturnsResult() {
        compare(1, 5, new int[]{1,2,3,4,5});
        compare(-1, 9, new int[]{1,2,3,45,5});
    }

    public void compare(int expected, int searched, int[] ints) {
        Assert.assertEquals(expected, chop(searched, ints));
    }

    private int chop(int i, int[] ints) {
        return (ints == null || ints.length == 0) ? -1 : binaryChop(i, ints);
    }

    private int binaryChop(int searched, int[] ints) {
       return (ints.length == 1 && ints[0] == searched || ints.length ==2 && ints[1] == searched) ? 1 : binarySearchChop(searched, ints);
    }

    private int binarySearchChop(int searched, int[] ints) {
        int mid = ints.length/2;
        int min = 0, max = ints.length;
        for (int i = 0; i < ints.length; i++) {
            if (searched == ints[mid]) return 1;
            if (searched < ints[mid]) {
                max = mid;
                mid = mid / 2;
            }
           // if (searched > ints[mid])
             //   mid = mid +
        }
        return 1;
    }
}
