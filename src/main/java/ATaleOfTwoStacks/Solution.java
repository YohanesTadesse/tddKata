package ATaleOfTwoStacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by tadessey on 3/7/18.
 *  * problem description
 *  * https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem
 */
public class Solution {
    final static Stack<Integer> stackOne = new Stack<>();
    final static Stack<Integer> stackTwo = new Stack<>();

    public static void main(final String[] args) {

        final Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            final int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(peek());
            }
        }
        scan.close();
    }

    private static int peek() {
        return stackOne.elementAt(stackOne.size()-1) ;
    }

    private static void enqueue(final int item) {
        stackOne.push(item);
    }

    private static void dequeue() {
        populateStack(stackTwo, stackOne);
        stackTwo.pop();
        populateStack(stackOne, stackTwo);

    }

    private static void populateStack(final Stack pushStack, final Stack popStack) {
        while (!popStack.isEmpty()) {
            pushStack.push(popStack.pop());
        }
    }
}
