import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class KataEightConflictingObjectivesTest {

    @Test
    public void returnEmptyFourEmptyDictionary() throws Exception {
        final String input = "barely";
        final List<String> str = KataEightConflictingObjectives.getComposedWord(input);
        str.forEach(x -> System.out.println(x));
    }
}
