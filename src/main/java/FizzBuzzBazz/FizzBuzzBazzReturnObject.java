package FizzBuzzBazz;

/**
 * Created by tadessey on 3/2/18.
 */
public class FizzBuzzBazzReturnObject {
    String str = "";
    int num;

    public FizzBuzzBazzReturnObject(final String str, final int num) {
        this.str = str;
        this.num = num;
    }

    public void setStr(final String str) {
        this.str = str;
    }

    public void setNum(final int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public int getNum() {
        return num;
    }

    public Object getRepresentedValue() {
        if (!str.isEmpty())
            return str;
        else
            return num;
    }
}
