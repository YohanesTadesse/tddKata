package FizzBuzz.Two;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzz {

    final static Map<Integer, String> keys = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        keys.put(3, "Fizz");
        keys.put(5, "Buzz");
        keys.put(7, "Bazz");
    }

    @Test
    public void shouldReturnStringOfIntNumber() {
        verify("1", 1);
    }

    @Test
    public void shouldReturnString2ForInt2() {
        verify("2", 2);
    }

    @Test
    public void shouldReturnFizzForInt3() {
        verify("Fizz", 3);
    }

    @Test
    public void givenMultipleOf3ShouldReturnFizz() {
        verify("Fizz", 6);
    }

    @Test
    public void givenInt5ReturnBuzz() {
        verify("Buzz", 5);
    }

    @Test
    public void shouldReturnBUzzGivenMultipleOf5() {
        verify("Buzz", 10);
    }

    @Test
    public void shouldReturnFizzBuzzFor15() {
        verify("FizzBuzz", 15);

    }

    @Test
    public void shouldReturnFizzBuzzFor30() {
        verify("FizzBuzz", 30);
    }

    @Test
    public void shouldReturnBazzGiven7() {
        verify("Bazz", 7);

    }

    @Test
    public void shouldReturnFizzBazzFor21() {
        verify("FizzBazz", 21);
    }

    @Test
    public void shouldReturnBuzzBazzFor35() {
        verify("BuzzBazz", 35);
    }

    @Test
    public void shouldReturnFizzBuzzBazzFor105() {
        verify("FizzBuzzBazz", 105);
    }

    private void verify(final String expected, final int input) {
        assertThat(FizzBuzz.getString(input), equalTo(expected));
    }


    private static String getString(final int input) {

        final StringBuilder sb = new StringBuilder();
        keys.entrySet().forEach(e-> {
            if (input % e.getKey() == 0)
               sb.append(e.getValue());
        });
        if (sb.length() == 0)
            return String.valueOf(input);

        return sb.toString();
    }
}
