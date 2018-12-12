
import java.util.Arrays;

public class RemoveDuplicateWithOrderOneAndNoExtraMemory {

    public static int[] deDup(final int[] nums) {
            return Arrays.stream(nums).distinct().toArray();
    }
}
