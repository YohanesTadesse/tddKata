package UglyNumber;

// Java program for power set
import java .io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GFG {

    static void printPowerSet(final char []set,
                              final int setSize)
    {

		/*set_size of power set of a set
		with set_size n is (2**n -1)*/
        final long powerSetSize =
                (long)Math.pow(2, setSize);
        int counter = 0;
        int j = 0;

		/*Run from counter 000..0 to
		111..1*/
        for( ; counter < powerSetSize; counter++)
        {
            for( ; j < setSize; j++)
            {
				/* Check if jth bit in the
				counter is set If set then
				print jth element from set */
                if( (counter & (1 << j)) > 0)
                    System.out.print(set[j]);
            }

            System.out.println();
        }
    }

    // Driver program to test printPowerSet
    public static void main ( final String[] args)
    {
        final char []set = {'a', 'b', 'c'};
        printPowerSet(set, 3);
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


}

// This code is contributed by anuj_67.

