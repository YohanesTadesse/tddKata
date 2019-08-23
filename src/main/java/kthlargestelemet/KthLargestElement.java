package kthlargestelemet;

import java.util.stream.IntStream;

public class KthLargestElement {

    public int kthLargestElement(final int n, final int[] nums) {
        return IntStream.of(nums).sorted().toArray()[(nums.length - n)];
    }
}
