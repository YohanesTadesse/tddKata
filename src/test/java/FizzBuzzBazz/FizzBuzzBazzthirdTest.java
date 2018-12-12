package FizzBuzzBazz;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by tadessey on 3/2/18.
 */
public class FizzBuzzBazzthirdTest {

    @Test
    public void passedEmptyListKeyShouldReturnEmptyList() throws Exception {
        final int[] input = {};
        final Map<Integer, String> key = new HashMap<>();
        final List<FizzBuzzBazzReturnObject> actual = FizzBuzzBazzThird.getResults(input, key);
        assertEquals(new ArrayList<>(), actual);
    }

    @Test
    public void givenInputWithOutKeyShouldReturnInput() throws Exception {
        final int[] input = {1};
        final List<FizzBuzzBazzReturnObject> actual = FizzBuzzBazzThird.getResults(input, new HashMap<>());
        assertEquals(
                Collections.singletonList(new FizzBuzzBazzReturnObject("", 1))
                        .stream().map(x->x.getRepresentedValue())
                        .collect(Collectors.toList()),
                actual.stream().map(x->x.getRepresentedValue()).collect(Collectors.toList()));
    }

    @Test
    public void givenInput3ShouldReturn() throws Exception {

    }
}
