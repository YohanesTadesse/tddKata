package DigitCount;

public class DigitCount {

    /**
     * @param k: An integer
     * @param n: An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(final int k, final int n) {
        if (n < k) return 0;
        int sum = k;
        int counter = 0;
        int power = 1;
        do {
            counter++;
            sum = sum + (int) Math.pow(10, power);
            power++;
        }
        while (sum < n);
        sum = k;
        power = 1;
        while (sum < n) {
            sum = sum * (int) Math.pow(10, power);
            power++;
            if (sum < n)
                counter++;
            if (power == 1) {
                counter += n - sum >= 10 ? 8 : (n - sum) - 1;
            }
        }
        return counter;
    }

    public int digitCountsLoop(final int k, final int n) {
        if (n < k) return 0;
        int count = 1;
        for (int i = 10; i <= n; i++) {
            int num = i;
            while (num != 0 ) {
                if (num % 10 == k) {
                    count++;
                }
                num /= 10;
            }
        }
        return count;
    }
}
