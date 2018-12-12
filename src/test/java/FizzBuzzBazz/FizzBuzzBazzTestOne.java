package FizzBuzzBazz;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by tadessey on 3/1/18.
 */
public class FizzBuzzBazzTestOne {
    private Map<Integer, String> key = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        key.put(3, "Fizz");
        key.put(5, "Buzz");
        key.put(7, "Bazz");
    }

    @Test
    public void givenEmptyKeyAndEmptyShouldReturnEmptyList() throws Exception {
        checkResult(new ArrayList<FizzBuzzBazzOneStatus>(), FizzBuzzBazzOne.getResult(new int[]{}, new HashMap<>()));
    }

    @Test
    public void givenThreeShouldReturnFizz() throws Exception {
        checkResult(Collections.singletonList(new FizzBuzzBazzOneStatus("Fizz", 3)), FizzBuzzBazzOne.getResult(new int[]{3}, key));
    }

    @Test
    public void shouldReturnFizzForDivisibleByThreeAndBuzzDivisibleByFive() throws Exception {
        final List<FizzBuzzBazzOneStatus> expected =  Arrays.asList(
                new FizzBuzzBazzOneStatus("", 1),
                new FizzBuzzBazzOneStatus("", 2),
                new FizzBuzzBazzOneStatus("Fizz", 3),
                new FizzBuzzBazzOneStatus("", 4),
                new FizzBuzzBazzOneStatus("Buzz", 5),
                new FizzBuzzBazzOneStatus("Fizz", 6));
        final List<FizzBuzzBazzOneStatus> actual = FizzBuzzBazzOne.getResult(new int[]{1, 2, 3, 4, 5, 6}, key);
        checkResult(expected, actual);
    }

    @Test
    public void shouldReturn7AsBazz() throws Exception {
        final List<FizzBuzzBazzOneStatus> actual = FizzBuzzBazzOne.getResult(new int[]{1, 6, 7}, key);
        final List<FizzBuzzBazzOneStatus> expected = Arrays.asList(
                new FizzBuzzBazzOneStatus("", 1),
                new FizzBuzzBazzOneStatus("Fizz", 6),
                new FizzBuzzBazzOneStatus("Bazz", 7));
        checkResult(expected, actual);
    }

    @Test
    public void fifteenShouldReturnFizBuzz() throws Exception {
        checkResult(Collections.singletonList(new FizzBuzzBazzOneStatus("FizzBuzz", 15)), FizzBuzzBazzOne.getResult(new int[]{15}, key));
    }

    @Test
    public void twentyOneShouldReturnFizzBazz() throws Exception {
        checkResult(Collections.singletonList(new FizzBuzzBazzOneStatus("FizzBazz", 21)), FizzBuzzBazzOne.getResult(new int[]{21}, key));
    }

    @Test
    public void thirtyFiveShouldReturnFuzzBazz() throws Exception {
        checkResult(Collections.singletonList(new FizzBuzzBazzOneStatus("BuzzBazz", 35)), FizzBuzzBazzOne.getResult(new int[]{35}, key));
    }

    @Test
    public void hundredAndFiveShouldReturnFizzBuzzBazz() throws Exception {
        checkResult(Collections.singletonList(new FizzBuzzBazzOneStatus("FizzBuzzBazz", 105)), FizzBuzzBazzOne.getResult(new int[]{105}, key));
    }

    private void checkResult(final List<FizzBuzzBazzOneStatus> expected, final List<FizzBuzzBazzOneStatus> actual) {
        assertEquals(expected, actual);
    }
}
