import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by tadessey on 5/26/17.
 */
public class StringAddition {

    @Test
    public void givenNullStringReturnNull() {
        Assert.assertEquals(null, stringCalculatorAdd(null));
    }

    @Test
    public void givenEmptyReturnEmpty() {
        Assert.assertEquals(new String(), stringCalculatorAdd(new String()));
    }
    
    @Test
    public void givenOneElementReturnsItself() {
        String st = "1";
        compare(st, stringCalculatorAdd(st));
    }
    
    public void compare(String a, String b){
        Assert.assertEquals(a, stringCalculatorAdd(b));
    }
    
    @Test
    public void givenTwoElementsReturnTwo() {
        compare("3","1+2");
    }

    @Test
    public void givenTwoRandomElementsReturnSum() {
        final int a = (int)Math.floor(Math.random()*10) + 1;
        final int b = (int)Math.floor(Math.random()*10) + 1;
        final String string = Integer.toString(a) + "+" + Integer.toString(b);
        final String string2 = Integer.toString(a+b);
        compare(string2, string);
    }

    public String stringCalculatorAdd(String numbers) {
        if (numbers == null || numbers.length() < 2) return numbers;

        final String[] splitted = split(numbers);
        final int a = Integer.parseInt(splitted[0]);
        final int b = Integer.parseInt(splitted[1]);
        return Integer.toString(a+b);

    }

    String[] split(String number) {
        return number.split("\\+");
    }
}
