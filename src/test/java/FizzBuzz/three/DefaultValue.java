package FizzBuzz.three;

public class DefaultValue implements FizzBuzzTwoMultiplesEvaluator {

    public String evaluate(final int input) {
        return String.valueOf(input);
    }

    @Override
    public void setNext(final FizzBuzzTwoMultiplesEvaluator evaluator) {
        // do nothing
    }
}
