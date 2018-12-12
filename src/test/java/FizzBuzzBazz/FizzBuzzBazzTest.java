package FizzBuzzBazz;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FizzBuzzBazzTest {
    final Map<Integer, Object> key = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        key.put(3, "Fizz");
        key.put(5, "Fuzz");
        key.put(7, "Bazz");
    }

    @Test
    public void divisibleByThreeShouldReturnFiZZ() throws Exception {
        final Map<Integer, Object> expected = new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 2);
        expected.put(3, "Fizz");
        expected.put(4, 4);
        expected.put(5, "Fuzz");
        final Map<Integer, Object> actual = FizzBuzzBazz.getResult(new int[]{1, 2, 3, 4, 5}, key);
        verifyTheResults(expected, actual);
    }

    @Test
    public void divisibleByThreeShouldReturnFiZZForDivisibleByThree() throws Exception {
        final Map<Integer, Object> expected = new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 2);
        expected.put(3, "Fizz");
        expected.put(4, 4);
        expected.put(6, "Fizz");

        final Map<Integer, Object> actual = FizzBuzzBazz.getResult(new int[]{1, 2, 3, 4, 6}, key);
        verifyTheResults(expected, actual);

    }

    @Test
    public void divisibleByThreeShouldReturnFiZZForDivisibleByThreeAndFuzzForDivisibleForFive() throws Exception {
        final Map<Integer, Object> expected = new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 2);
        expected.put(3, "Fizz");
        expected.put(4, 4);
        expected.put(5, "Fuzz");
        expected.put(6, "Fizz");

        final Map<Integer, Object> actual = FizzBuzzBazz.getResult(new int[]{1, 2, 3, 4, 5, 6}, key);
        verifyTheResults(actual, expected);

    }

    @Test
    public void shouldReturnFizzFuZZForFifteen() throws Exception {
        final Map<Integer, Object> expected = new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 2);
        expected.put(3, "Fizz");
        expected.put(4, 4);
        expected.put(5, "Fuzz");
        expected.put(6, "Fizz");
        expected.put(15, "FizzFuzz");
        final Map<Integer, Object> actual = FizzBuzzBazz.getResult(new int[]{1, 2, 3, 4, 5, 6, 15}, key);
        verifyTheResults(actual, expected);

    }

    @Test
    public void whileNumberIsDivisibleByFiveAndThreeShouldReturnFizzBAZZ() throws Exception {
        final Map<Integer, Object> expected = new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 2);
        expected.put(3, "Fizz");
        expected.put(4, 4);
        expected.put(5, "Fuzz");
        expected.put(6, "Fizz");
        expected.put(7, "Bazz");
        expected.put(15, "FizzFuzz");
        expected.put(21, "FizzBazz");
        final Map<Integer, Object> actual = FizzBuzzBazz.getResult(new int[]{1, 2, 3, 4, 5, 6, 7, 15, 21}, key);
        verifyTheResults(actual, expected);
    }

    @Test
    public void whileNumberIsDivisibleByFiveAndSevenShouldReturnFUZZBAZZ() throws Exception {
        final Map<Integer, Object> expected = new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 2);
        expected.put(3, "Fizz");
        expected.put(4, 4);
        expected.put(5, "Fuzz");
        expected.put(6, "Fizz");
        expected.put(7, "Bazz");
        expected.put(15, "FizzFuzz");
        expected.put(21, "FizzBazz");
        expected.put(35, "FuzzBazz");
        final Map<Integer, Object> actual = FizzBuzzBazz.getResult(new int[]{1, 2, 3, 4, 5, 6, 7, 15, 21, 35}, key);
        verifyTheResults(actual, expected);
    }

    @Test
    public void whileNumberIsDivisibleByThreeFiveAndSevenShouldReturnFizzBuzzBaz() throws Exception {
        final Map<Integer, Object> expected = new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 2);
        expected.put(3, "Fizz");
        expected.put(4, 4);
        expected.put(5, "Fuzz");
        expected.put(6, "Fizz");
        expected.put(7, "Bazz");
        expected.put(15, "FizzFuzz");
        expected.put(21, "FizzBazz");
        expected.put(35, "FuzzBazz");
        expected.put(105, "FizzFuzzBazz");
        final Map<Integer, Object> actual = FizzBuzzBazz.getResult(new int[]{1, 2, 3, 4, 5, 6, 7, 15, 21, 35, 105}, key);
        verifyTheResults(actual, expected);
    }

    private void verifyTheResults(final Map<Integer, Object> expected, final Map<Integer, Object> result) {
        assertEquals(result, expected);
    }
}
