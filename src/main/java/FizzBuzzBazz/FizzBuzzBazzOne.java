package FizzBuzzBazz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by tadessey on 3/1/18.
 */
public class FizzBuzzBazzOne {
    public static List<FizzBuzzBazzOneStatus> getResult(final int[] input, final Map<Integer, String> key) {
        final List<FizzBuzzBazzOneStatus> list = new ArrayList<>();
        Arrays.stream(input).forEach(a -> {
            String s = "";
            final FizzBuzzBazzOneStatus element = new FizzBuzzBazzOneStatus();
            element.setNum(a);
            for (Map.Entry<Integer, String> entry :
                    key.entrySet()) {
                if (a % entry.getKey() == 0)
                    s = s + entry.getValue();
            }
            element.setStatus(s);
            list.add(element);
        });
        return list;
    }
}
