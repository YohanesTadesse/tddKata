package threesum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {
    List<List<Integer>> threeSum(int[] numbers) {
        // write your code here

        final List<List<Integer>> lists = threeSumSubSets(numbers);
        final List<List<Integer>> threes = lists.stream().filter(x -> x.size() == 3).distinct().collect(Collectors.toList());
        final List<List<Integer>> three = new ArrayList<>();
        if (threes.isEmpty()) return new ArrayList<>();
        for (List<Integer> list : threes
        ) {
            Collections.sort(list);
            three.add(list);
        }
        return three;
    }

    List<List<Integer>> threeSumSubSets(int[] numbers) {
        // write your code here
        List<List<Integer>> lists = new ArrayList<>();
        if (numbers.length == 0) {
            lists.add(Collections.emptyList());
            return lists;
        }
        int head = numbers[0];
        final int[] rest = new int[numbers.length - 1];
        System.arraycopy(numbers, 1, rest, 0, numbers.length - 1);

        for (List<Integer> list : threeSumSubSets(rest)) {
            int sum = head;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            if (sum == 0) {
                final List<Integer> newList = new ArrayList<>();
                newList.add(head);
                newList.addAll(list);
                lists.add(newList);
            }
        }
        return lists;
    }

    @Test
    public void name() {
        System.out.println(threeSum(new int[]{-1, 1, 0}));
    }

    public int minLength(String s, Set<String> dict) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.delete(sb.indexOf(s), sb.lastIndexOf(s));
            for (String st : dict) {
                s.replaceAll(st, "");
            }
            return 1;
    }


//    StringBuilder min(StringBuilder sb , Set<String> dict) {
//
//    }
}
