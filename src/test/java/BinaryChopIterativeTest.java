
import org.junit.Assert;
import org.junit.Test;


public class BinaryChopIterativeTest {

    @Test
    public void givenEmptyReturnNegative() {
        Assert.assertEquals(-1, chop(1, new int[]{}));
    }

    @Test
    public void givenNullArrayReturnNegative() {
        Assert.assertEquals(-1, chop(1, null));
    }

    @Test
    public void givenOneElementAndReturnResult() {
        Assert.assertEquals(1, chop(1,new int[]{1}));
    }

    @Test
    public void givenTwoElementsAndReturnResultIfFound() {
        Assert.assertEquals(-1, chop(1, new int[]{2,3}));
        Assert.assertEquals(1,chop(1, new int[]{1,2}));
    }

    @Test
    public void givenArrayOfIntegersReturnResult() {
        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (int) Math.random()*10; // all will be zeros
        }
        int array2[] ={1,2,3,4,5,6};
        Assert.assertEquals(1, chop(array[1], array));
        Assert.assertEquals(1, chop(array[3], array));
        Assert.assertEquals(1, chop(4, array2));
        Assert.assertEquals(-1,chop(7,array2));
    }

    private int chop(int searched, int[] numbers) {
        BiggestPrime biggestPrime = new BiggestPrime();
        biggestPrime.setAbs("hello");
        absA(biggestPrime);
            return (numbers == null || numbers.length == 0  ? -1 : binaryChop(searched, numbers));
    }

    private int binaryChop(int searched, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (searched == numbers[i]) return 1;
        }

        return -1;
    }

    private void absA(BiggestPrime biggestPrime) {
        String ss = biggestPrime.getAbs();
        System.out.print(ss);
    }
    private void reording() {
        String a = "abc";
        String b;
        for(int i = 0; i< a.length(); i++) {
            b = a.substring(i);
        }
    }

    private String permutationForThree(String input) {
        return input = ("" + input.charAt(1) + input.charAt(0));
    }

}
