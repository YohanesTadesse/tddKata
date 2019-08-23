import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by tadessey on 3/30/18.
 *
 */
public class JewelsInStones {

    public int numJewelsInStones(final String j, final String s) {
        System.out.println("aAABBba".replaceAll("[^Aa]", ""));
        return s.replaceAll("[^" + j + "]", "").length();
    }

    public int hammingDistance(final int x, final int y) {
        return Integer.bitCount(x ^ y);
    }


    public boolean judgeCircle(final String moves) {
        final Map<String, Integer> map = new HashMap<>();

        int row = moves.length();
        int column = moves.length();
        map.put(row + "" + column, 1);
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                column--;
            } else if (moves.charAt(i) == 'R') {
                column++;

            } else if (moves.charAt(i) == 'U') {
                row--;
            } else if (moves.charAt(i) == 'D') {
                row++;
            }
        }
        if (null != map.get(row + "" + column)) {
            return true;
        }
        return false;
    }

    public List<Integer> selfDividingNumbers(final int left, final int right) {
        int l = left;
        final List<Integer> nums = new ArrayList<>();
        while (l <= right) {
            if (isSelfDividing(l))
                 nums.add(l);
            l = l + 1;
        }
        return nums;
    }

    private boolean isSelfDividing(final int element) {
        int value = element;
        while (value != 0) {
            final int reminder = value % 10;
            if (reminder == 0 || element % reminder != 0) return false;
            value = value / 10;
        }
        return true;
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i+2) {
            sum = sum + (nums[i] < nums[i+1] ? nums[i] : nums[i + 1]);
        }
        return sum;
    }

/*
* Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]


Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
 */
    List<Integer> num = new ArrayList<>();
    public int[] shortestToChar(String S, final char C) {
        int i = 0;
        while (i < S.length()) {
            i = S.indexOf(C);
            computeValue(i);
            i++;
            if (i < S.length())
            S = S.substring(i);
        }
        final int check = S.length() - num.size();
        int lastElement = num.size() - 1;
        while (check > -1) {
           num.add(++lastElement);
        }
        return num.stream().mapToInt(x-> x).toArray();
    }

    private void computeValue(int index) {
        int size = 0;
        if (!num.isEmpty()) {
            size = num.size();
            index = index - size;
        }
        while (index >= 0) {
            int counter = index;
            if (size > 0) {
                final Integer integer = num.get(num.size() - 1);
                if (integer < index) {
                    counter = integer + 1;
               }
            }
            num.add(counter);
            index--;
        }
    }

    public int[] shortestToCharprecise(final String string, final char character) {
        final int stringLength = string.length();
        final int []nums = new int[stringLength];
        int counter = -stringLength;
        for (int i = 0; i < stringLength; i++) {
            if (string.charAt(i) == character)
                counter = i - counter;
        }

        return nums;
    }



    public int maxIncreaseKeepingSkyline(final int[][] grid) {
        final int length = grid.length;
        final int [] topToBottom = new int[length];
        final int [] leftToRight = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                leftToRight[i] = Math.max(leftToRight[i], grid[i][j]);
                topToBottom[j] = Math.max(topToBottom[j], grid[i][j]);
            }
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                sum += Math.min(leftToRight[i], topToBottom[j]) - grid[i][j];
            }
        }
        return sum;
    }

//
//
//    public int removeDuplicates(final int[] nums) {
//        if (nums.length == 0)
//            return 0;
//        int count = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[i - 1]) {
//                count++;
//            } else {
//
//            }
//
//        }
//        return count;
//    }

}
