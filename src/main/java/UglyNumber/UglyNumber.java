package UglyNumber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UglyNumber {
    /**
     * @param n: An integer
     * @return: the nth prime number as description.
     */
    public int nthUglyNumber(final int n) {
            // write your code here
            int uglyNumber = 0;
            int counter = 0;
            int number = 0;
            while (number <= n) {
                if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number == 1) {
                    counter++;
                    uglyNumber = number;
                }
                number++;
            }
            return uglyNumber;
        }

    public int nthUglyNumber2(final int n) {
        int count = 1;
        int num = 1;
        final Map<Integer, Integer> ints = new HashMap<>();
        while (count <= n) {
            if (null == ints.get(num * 2)) {
                ints.put(num * 2, 1);
                count++;
            }
            if (count <= n && null == ints.get(num * 2)) {
                ints.put(num * 3, 1);
                count++;
            }
            if (count <= n && null == ints.get(num * 2)) {
                ints.put(num * 5, 1);
                count++;
            }
            num++;
        }
        return ints.keySet().stream().max(Comparator.comparing(Integer::valueOf)).orElse(0);

    }

    public void permutations(final String str) {
        final List<String> list = new ArrayList<>();
        list.addAll(permute("", str));
        for (String st: list
             ) {
            System.out.println(st);
        }
    }

    private List<String> permute(final String prefix, final String str) {
        final List<String> list = new ArrayList<>();
        final int length = str.length();
        if (length == 0) list .add(prefix);
        else {
            for (int i = 0; i < length; i++) {

                list.addAll(permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, length)));
            }
        }
        return list;
    }

    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
        return new ArrayList<>();

    }

//    private List<List<Integer>> permuteSubSet(final int[] nums) {
////        System.out.println(nums);
////        for (int i = 0; i < nums.length; i++) {
////
////        }
////    }



    public int possibleStep(final int[] hops, final int steps) {

        int counter = 0;
        counter += recurse(hops, steps, 0, 0);
        System.out.println(counter);
        return counter;
    }

    private int recurse(final int[] hops, final int steps, final int i, int sum) {
        int counter = 0;
        if (sum > steps) {
            return 0;
        }
        if (sum == steps) {
            return 1;
        }
        for (int j = 0; j < hops.length; j++) {
            sum += hops[j];
            System.out.println("sum: "+ sum + " J:" + "counter:" + counter);
            counter+= recurse(hops, steps, j, sum);
            sum -= hops[j];
        }
        return counter;
    }


    public void robotInGrid(int[][] grid, int row, int column) {
        final int rowLength =  grid[0].length;
        final int columnLength =  grid.length;
        List<int[][]> grids = new ArrayList<>();
    }

    public boolean robotInGrid(final int[][] grid, final int row, final int column, final int rowLength, final int columnLength) {
//        final List<int[][]> gridsList = new ArrayList<>();
//        destination is 2
        boolean path = false;
        if (grid[row][column] == 2) {

//            gridsList.add(new int[][]{{row}, {column}});
//            return gidsList
            return true;
        }
        if (grid[row][column] == 3 || grid[row][column] == 1) {
//            return empty gridList bomb
            return false;
        } else {
            grid[row][column] = 1;
        }


        if (row + 1 < rowLength && !path) {
            path |= robotInGrid(grid, row + 1, column, rowLength, columnLength);
        }
        if (column + 1 < columnLength && !path) {
            path |= robotInGrid(grid, row, column + 1, rowLength, columnLength);
        }

        return path;
    }




}
