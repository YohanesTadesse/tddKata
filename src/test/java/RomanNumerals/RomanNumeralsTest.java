package RomanNumerals;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by tadessey on 3/16/18.
 */
public class RomanNumeralsTest {

    @Test
    public void onePlusOneShouldReturnTwoRomanNumber() throws Exception {
        final String numOne = "I";
        final String numTwo = "I";
        assertEquals("II", RomanNumerals.getSumOfRomanNumbers(numOne, numTwo));
    }

    @Test
    public void onePlusTwoShouldReturnThree() throws Exception {
        final String numOne = "I";
        final String numTwo = "II";
        assertEquals("III", RomanNumerals.getSumOfRomanNumbers(numOne, numTwo));

    }


    Stack<Integer> tempStack = new Stack<>();
    Stack<Integer> orginalStack = new Stack<>();
    List<Integer> sortedArray = new ArrayList<>();
    public int pop() {
        return orginalStack.pop();
    }
    public void push(final int element) {
        orginalStack.push(element);
        sortedArray.add(element);
        Collections.sort(sortedArray);
    }
    // top is like peek
    public int top() {
        return orginalStack.peek();
    }
    public int getMin(){
            int minNumber = sortedArray.remove(0);
            while(orginalStack.size() > -1){
                int popped = orginalStack.pop();
                if (popped == minNumber) {
                    break;
                } else {
                    tempStack.push(popped);
                }

            }
            while (tempStack.size() > -1) {
                orginalStack.push(tempStack.pop());
            }
            return minNumber;
    }
}
