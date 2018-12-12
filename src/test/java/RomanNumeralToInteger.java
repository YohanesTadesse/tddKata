import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by tadessey on 8/4/17.
 */
public class RomanNumeralToInteger {


    @Test
    public void givenZeroReturnsNull() {
        verify(null, 0);
    }

    @Test
    public void givenOneRetrunI() {
        verify("I", 1);
    }

    @Test
    public void givenTwoReturnsII() {
        verify("II", 2);
    }

//    @Test
//    public void givenThreeReturnIII() {
//        verify("III", 3);
//    }
//    @Test
//    public void givenFourShouldReturnIV() {
//        verify("IV", 4);
//    }
//
//    @Test
//    public void givenFiveShouldReturnV() {
//        verify("V", 5);
//    }
//
//    @Test
//    public void givenSixShouldReturnVI() throws Exception {
//        verify("VI", 6);
//    }
//
//    @Test
//    public void givenTenShouldReturnX() {
//        verify("X", 10);
//    }

    private void verify(final String expected, final int request) {
        final String actual = getRomanEquvalent(request);
        Assert.assertEquals(expected, actual);
    }

    final int[] arabNumber = {1};
    final String[] romanNumber = {"I"};

    private String getRomanEquvalent(final int input) {
        if (input > 0) {

            return romanNumber[input - 1];
        }
        return null;

    }

}
