package FizzBuzz.one;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FizzBuzzTest {

    @Test
    public void shouldEvaluateInt1AsString1() {
        assertThat(Evaluate(1), equalTo("1"));
    }

    @Test
    public void shouldEvaluateIntAsString() {

        assertThat(Evaluate(2), equalTo("2"));
    }

    @Test
    public void shouldEvaluate3AsFizz() {
        assertThat(Evaluate(3), equalTo("fizz"));
    }

    @Test
    public void shouldEvaluateMod3AsFizz() {
        assertThat(Evaluate(6), equalTo("fizz"));
    }

    @Test
    public void shouldEvaluate5AsBuzz() {
        assertThat(Evaluate(5), equalTo("buzz"));
    }

    @Test
    public void shouldEvaluateMod5AsBuzz() {
        assertThat(Evaluate(10), equalTo("buzz"));
    }

    @Test
    public void shouldEvaluate30AsFizzBuzz() {
        assertThat(Evaluate(30), equalTo("fizzbuzz"));
    }

    @Test
    public void shouldEvaluate3And5AsFizzBuzz() {
        assertThat(Evaluate(15), equalTo("fizzbuzz"));
    }

    // use the Strategy Pattern, use the Chain of Responsiblity Pattern, use the Builder Pattern

    private String Evaluate(final int input) {

        IEvaluatorFactory factory = new IEvaluatorFactory();

        IEvaluator iEvaluator = factory.create();

        return iEvaluator.evaluate(input);

//        IEvaluator returnFizzBuzzForMod15 = new ReturnFizzBuzzForMod15();
//        final String mod15Result = returnFizzBuzzForMod15.evaluate(input);
//        if (mod15Result != "") return mod15Result;
//
//        IEvaluator returnBuzzForMod5 =  new ReturnBuzzForMod5();
//        final String mod5Result = returnBuzzForMod5.evaluate(input);
//        if (mod5Result != "") return mod5Result;
//
//        IEvaluator returnFizzForMod3 = new ReturnFizzForMod3();
//        String mod3Result = returnFizzForMod3.evaluate(input);
//        if (mod3Result != "") return mod3Result;
//
//        IEvaluator returnStringOfInt = new ReturnStringOfInt();
//        return returnStringOfInt.evaluate(input);
    }


    public class IEvaluatorFactory {
        private IEvaluator iEvaluator;
        public IEvaluator create() {
            this.iEvaluator = new ReturnFizzBuzzForMod15();
            IEvaluator returnBuzzForMod5 = new ReturnBuzzForMod5();
            IEvaluator returnBuzzForMod3 = new ReturnFizzForMod3();
            IEvaluator returnStringOfInt = new ReturnStringOfInt();

            returnBuzzForMod3.setNextIEvaluator(returnStringOfInt);
            returnBuzzForMod5.setNextIEvaluator(returnBuzzForMod3);
            iEvaluator.setNextIEvaluator(returnBuzzForMod5);

            return iEvaluator;
        }
    }

    public interface IEvaluator {
        void setNextIEvaluator(IEvaluator nextIEvaluator);
        String evaluate(final int input);
    }

    public class ReturnStringOfInt implements IEvaluator {
        private IEvaluator nextEvaluator;
        @Override
        public void setNextIEvaluator(final IEvaluator nextIEvaluator) {
            this.nextEvaluator =  nextIEvaluator;
        }

        public String evaluate(final int input) {
            return String.valueOf(input);
        }
    }

    public class ReturnFizzForMod3 implements IEvaluator {
        private IEvaluator nextIEvaluator;
        @Override
        public void setNextIEvaluator(final IEvaluator nextIEvaluator) {
            this.nextIEvaluator = nextIEvaluator;
        }

        public String evaluate(final int input) {
            if (input %3 == 0) return "fizz";

            return nextIEvaluator.evaluate(input);
        }
    }

    public class ReturnBuzzForMod5 implements IEvaluator {

        private IEvaluator nextIEvaluator;
        @Override
        public void setNextIEvaluator(final IEvaluator nextIEvaluator) {
            this.nextIEvaluator = nextIEvaluator;
        }

        public String evaluate(final int input) {
            if (input % 5 ==0 ) return "buzz";

            return nextIEvaluator.evaluate(input);
        }
    }

    public class ReturnFizzBuzzForMod15 implements IEvaluator {
        private IEvaluator nextIEvaluator;
        @Override
        public void setNextIEvaluator(final IEvaluator nextIEvaluator) {
            this.nextIEvaluator = nextIEvaluator;
        }

        public String evaluate(final int input) {
            if (input % 15 == 0) return "fizzbuzz";

            return nextIEvaluator.evaluate(input);
        }
    }

//    private String Evaluate(final int input) {
//
//        if (input % (3* 5) == 0) return "fizzbuzz";
//
//        if (input % 5 == 0) return "buzz";
//
//        if (input % 3 == 0) return "fizz";
//
//        return String.valueOf(input);
//    }

}
