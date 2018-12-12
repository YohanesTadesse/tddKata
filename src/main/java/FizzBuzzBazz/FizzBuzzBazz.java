package FizzBuzzBazz;

import java.util.HashMap;
import java.util.Map;


public class FizzBuzzBazz {

    public static Map<Integer, Object> getResult(final int[] input, final Map<Integer, Object> key) {
        final Map<Integer, Object> result = new HashMap<>();
        for (int a : input) {
            for (Map.Entry<Integer, Object> entry: key.entrySet()) {
                if (a % entry.getKey() == 0) {
                    if (null != result.get(a) && result.get(a) instanceof String)
                        result.put(a, (result.getOrDefault(a, "").toString() + entry.getValue()));
                    else
                        result.put(a, entry.getValue());
                } else
                    result.putIfAbsent(a, a);
            }

        }
        return result;
    }

}
