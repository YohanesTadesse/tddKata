
import java.util.ArrayList;
import java.util.List;

/**
 * @param root: param root: The root of the binary search tree
 * @param k1:   An integer
 * @param k2:   An integer
 * @return: return: Return all keys that k1<=key<=k2 in ascending order
 */

public class RangeInBST {

    public List<Integer> searchRange(final BST root, final int k1, final int k2) {
        return getStackOfNodes(root, new ArrayList<>(), k1, k2);
    }

    private List<Integer> getStackOfNodes(final BST node, final List<Integer> stack, final int k1, final int k2) {
        if (null == node) return stack;

        final int value = node.val;
        if (value > k1 && value < k2) {
            stack.add(value);
            getStackOfNodes(node.left, stack, k1, k2);
            getStackOfNodes(node.right, stack, k1, k2);
        }
        return stack;
    }


    class BST {
        public BST left;
        public BST right;
        public int val;

        public BST(final int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }


    }
}
