package FizzBuzzBazz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by tadessey on 3/2/18.
 */
public class FizzBuzzBazzThird {
    public static List<FizzBuzzBazzReturnObject> getResults(final int[] input, final Map<Integer, String> key) {
        final List<FizzBuzzBazzReturnObject> returnObjects = new ArrayList<FizzBuzzBazzReturnObject>();
        if (input.length > 0)
          returnObjects.add(new FizzBuzzBazzReturnObject("", 1));
         return returnObjects;
    }
}
