package FizzBuzz.three;

public class MultipleOf3 implements FizzBuzzTwoMultiplesEvaluator {

    private FizzBuzzTwoMultiplesEvaluator nextEvaluator;

    public String evaluate(final int input) {
        if (input % 3 == 0) return "Fizz";
        return nextEvaluator.evaluate(input);
    }

    @Override
    public void setNext(final FizzBuzzTwoMultiplesEvaluator evaluator) {
        this.nextEvaluator = evaluator;
    }
}

