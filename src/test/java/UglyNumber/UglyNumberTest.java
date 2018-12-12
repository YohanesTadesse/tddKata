package UglyNumber;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class UglyNumberTest {
    UglyNumber uglyNumber;

    @Before
    public void setUp() throws Exception {
        uglyNumber = new UglyNumber();

    }

    @Test
    public void name() {
        System.out.println(uglyNumber.nthUglyNumber2(10));
    }

    @Test
    public void given41Expected150() {
        assertEquals(uglyNumber.nthUglyNumber2(41), 150);


    }

    @Test
    public void permutations() {
        uglyNumber.permutations("abc");
    }

    @Test
    public void subsets() {
        final List<List<Integer>> lists = new ArrayList<>();
        assertEquals(uglyNumber.subsets(new int[]{}), lists);
        final Integer integer = 1;
        final List<Integer> ints = Collections.singletonList(integer);
        assertEquals(uglyNumber.subsets(new int[]{1}), lists.addAll(Collections.EMPTY_LIST));
    }

    @Test
    public void possibleStep() {
        uglyNumber.possibleStep(new int[]{3, 2, 1}, 5);
    }

    @Test
    public void robotInGridReturnFalse() {
        int[][] grid = new int[][]{{1, 3, 3}, {3, 3, 2}, {3, 3, 3}};
        boolean result = uglyNumber.robotInGrid(grid, 0, 0, 3, 3);
        assertFalse(result);
    }

    @Test
    public void robotInGridReturnTrue() {
        int[][] grid = new int[][]{{7, 3, 3}, {0, 0, 2}, {3, 3, 3}};
        boolean result = uglyNumber.robotInGrid(grid, 0, 0, 3, 3);
        assertTrue(result);
    }

    @Test
    public void robotInGridReturnTrue2() {
        int[][] grid = new int[][]{{7, 0, 3}, {1, 0, 2}, {3, 3, 3}};
        boolean result = uglyNumber.robotInGrid(grid, 0, 0, 3, 3);
        assertTrue(result);
    }

    public static <T> Set<Set<T>> powerSet(final Set<T> originalSet) {
        final Set<Set<T>> sets = new HashSet<Set<T>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<T>());
            return sets;
        }
        final List<T> list = new ArrayList<T>(originalSet);
        final T head = list.get(0);
        final Set<T> rest = new HashSet<T>(list.subList(1, list.size()));
        for (Set<T> set : powerSet(rest)) {
            final Set<T> newSet = new HashSet<T>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }

    @Test
    public void powerSet() {
        final Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Set<Set<Integer>> sets = powerSet(set);
        System.out.println(sets);
    }

}
