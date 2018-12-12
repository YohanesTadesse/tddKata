package StackMin;

import java.util.Stack;

/**
 * Created by tadessey on 4/22/18.
 */
public class StackMin {
    Stack<Integer> stack = new Stack<>();
    int min = 0;
    public void push(final int value) {
        int current = value;
        if (current > min) {
           current = (2 * current) - min;
        }
        stack.push(current);
    }
    public int pop() {
        return stack.pop();
    }

}
