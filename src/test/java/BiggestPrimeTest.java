import org.junit.Assert;
import org.junit.Test;


public class BiggestPrimeTest {


    private String abs;
    @Test
    public void returnsTwoWhileInputOne() {
        Assert.assertEquals(2, biggestPrime("2+1"));
    }

    public int biggestPrime(String num) {
      return 0;
    }

    @Test
    public void returnsList() {
        BiggestPrime biggestPrime = new BiggestPrime();
        System.out.println(biggestPrime.operation().toString());
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }
}
