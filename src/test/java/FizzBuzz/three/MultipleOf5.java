package FizzBuzz.three;

public class MultipleOf5 implements FizzBuzzTwoMultiplesEvaluator {

    private FizzBuzzTwoMultiplesEvaluator nextEvaluator;

    @Override
    public String evaluate(final int input) {
        if (input % 5 == 0) return "Buzz";
        return nextEvaluator.evaluate(input);
    }

    @Override
    public void setNext(final FizzBuzzTwoMultiplesEvaluator evaluator) {
        this.nextEvaluator = evaluator;
    }
}
