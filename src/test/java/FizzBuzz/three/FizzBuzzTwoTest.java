package FizzBuzz.three;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTwoTest {

    FizzBuzzTwo two = new FizzBuzzTwo();

    @Test
    public void shouldReturnStringOneForInt1() {
        assertThat(two.evaluate(1), equalTo("1"));
    }

    @Test
    public void shouldReturnStringTwoGivenInt2() {
        assertThat(two.evaluate(2), equalTo("2"));
    }

    @Test
    public void shouldReturnFizzGivenInt3() {
        assertThat(two.evaluate(3), equalTo("Fizz"));
    }

    @Test
    public void shouldReturnFizzForMultipleOf3() {
        assertThat(two.evaluate(6), equalTo("Fizz"));
    }

    @Test
    public void shouldReturnBuzzFor5() {
        assertThat(two.evaluate(5), equalTo("Buzz"));
    }

    @Test
    public void shouldReturnBuzzFor10() {
        assertThat(two.evaluate(10), equalTo("Buzz"));
    }

    @Test
    public void shouldReturnFizzBuzzFor15() {
        assertThat(two.evaluate(15), equalTo("FizzBuzz"));
    }

    @Test
    public void shouldReturnFizzBuzzForMultipleOf15() {
        assertThat(two.evaluate(30), equalTo("FizzBuzz"));
    }


    public class FizzBuzzTwo {

        FizzBuzzTwoMultiplesEvaluatorFactory factory = new FizzBuzzTwoMultiplesEvaluatorFactory();
        FizzBuzzTwoMultiplesEvaluator evaluator = factory.create();

        public String evaluate(final int input) {
           return evaluator.evaluate(input);
        }
    }

}

