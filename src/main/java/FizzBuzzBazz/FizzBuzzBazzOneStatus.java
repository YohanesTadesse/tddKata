package FizzBuzzBazz;

/**
 * Created by tadessey on 3/1/18.
 */
public class FizzBuzzBazzOneStatus {
    private String status = "";
    private int num;

    public FizzBuzzBazzOneStatus() {
    }

    public FizzBuzzBazzOneStatus(final String status, final int num) {
        this.status = status;
        this.num = num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public int getNum() {
        return num;
    }

    public void setNum(final int num) {
        this.num = num;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final FizzBuzzBazzOneStatus that = (FizzBuzzBazzOneStatus) o;

        if (num != that.num) return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = status != null ? status.hashCode() : 0;
        result = 31 * result + num;
        return result;
    }
}
