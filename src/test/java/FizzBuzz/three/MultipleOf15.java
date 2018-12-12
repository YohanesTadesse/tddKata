package FizzBuzz.three;

public class MultipleOf15 implements FizzBuzzTwoMultiplesEvaluator {
    private FizzBuzzTwoMultiplesEvaluator nextEvaluator;

    @Override
    public String evaluate(final int input) {
        if (input % 15 == 0)
            return "FizzBuzz";
        return nextEvaluator.evaluate(input);
    }

    @Override
    public void setNext(final FizzBuzzTwoMultiplesEvaluator evaluator) {
        this.nextEvaluator = evaluator;
    }
}
