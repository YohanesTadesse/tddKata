package PrimeFactorKata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class PrimeFactor {
    @Test
    public void givenOneShouldReturnEmptyList() throws Exception {
        verifyPrimeFactors(getPrimeFactors(1));
    }

    @Test
    public void givenTwoShouldReturnTwo() throws Exception {
        verifyPrimeFactors(getPrimeFactors(2), 2);
    }

    @Test
    public void given3ShouldReturn3() throws Exception {
        verifyPrimeFactors(getPrimeFactors(3), 3);
    }

    @Test
    public void given5ShouldReturn5() throws Exception {
        verifyPrimeFactors(getPrimeFactors(5), 5);
    }

    @Test
    public void given4ShouldReturnTwoAndTwo() throws Exception {
        verifyPrimeFactors(getPrimeFactors(4), 2, 2);
    }

    @Test
    public void given6ShouldReturn2And3() throws Exception {
        verifyPrimeFactors(getPrimeFactors(6), 2, 3);
    }

    @Test
    public void given8ShouldReturn222() throws Exception {
        verifyPrimeFactors(getPrimeFactors(8), 2, 2, 2);
    }

    @Test
    public void given9ShouldReturn33() throws Exception {
        verifyPrimeFactors(getPrimeFactors(9), 3, 3);
    }

    private void verifyPrimeFactors(final List<Integer> actualFactors, final Integer... expectedFactors) {
        assertThat(actualFactors, containsInAnyOrder(expectedFactors));
    }

    private List<Integer> getPrimeFactors(final int input) {
        final List<Integer> primeFactors = new ArrayList<>();
        int tempInput = input;
        for (int prime = 2; tempInput > 1; prime++) {
            for (; tempInput % prime == 0; tempInput /= prime) {
                primeFactors.add(prime);
            }
        }
        return primeFactors;
    }


}
