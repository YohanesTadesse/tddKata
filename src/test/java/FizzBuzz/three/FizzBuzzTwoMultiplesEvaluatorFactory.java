package FizzBuzz.three;

public class FizzBuzzTwoMultiplesEvaluatorFactory {


    public FizzBuzzTwoMultiplesEvaluator create() {

        final FizzBuzzTwoMultiplesEvaluator multipleOf15 = new MultipleOf15();
        final FizzBuzzTwoMultiplesEvaluator multipleOf5 = new MultipleOf5();
        final FizzBuzzTwoMultiplesEvaluator multipleOf3 = new MultipleOf3();
        final FizzBuzzTwoMultiplesEvaluator defaultValue = new DefaultValue();

        multipleOf15.setNext(multipleOf5);
        multipleOf5.setNext(multipleOf3);
        multipleOf3.setNext(defaultValue);

        return multipleOf15;
    }

}
