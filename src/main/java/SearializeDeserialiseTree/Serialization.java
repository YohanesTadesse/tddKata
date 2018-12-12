package SearializeDeserialiseTree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Serialization {



    public String serialize(final TreeNode root) {
        // write your code here
        if (root == null) return null;
        final StringBuilder builder = new StringBuilder();
        final LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            final TreeNode node = queue.remove();
            if (node != null) {
                builder.append(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            else
                builder.append("#");

        }

        while (builder.lastIndexOf("#") == (builder.length() - 1)) {
            builder.deleteCharAt(builder.length() - 1);
        }
        return builder.toString();
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(final String data) {
        // write your code here
        if (null == data || data.isEmpty() || data.charAt(0) == '#') return null;
        final LinkedList<TreeNode> queue = new LinkedList<>();
        int i = 0;
        final int length = data.length();
        final TreeNode head = new TreeNode(Math.abs(48 - data.charAt(i)));
        queue.add(head);
        i++;
        while (i < data.length()) {
            final TreeNode node = queue.remove();
            final TreeNode left = data.charAt(i) == '#' ? null : new TreeNode(Math.abs(48 - data.charAt(i)));
            if (left != null) {
                node.left = left;
                queue.add(left);
            }
            i++;
            if (i < length) {
                final TreeNode right = data.charAt(i) == '#' ? null : new TreeNode(Math.abs(48 - data.charAt(i)));
                if (null != right) {
                    node.right = right;
                    queue.add(right);
                }
                i++;
            }

        }
        return head;
    }









//    public String serialize(final TreeNode root) {
//        // write your code here
//
//        if (root == null)
//            return null;
//        final StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(root.getVal());
//        stringBuilder.append(null == serialize(root.getLeft())? "#" : serialize(root.getLeft()));
//        stringBuilder.append(null == serialize(root.getRight())? "#" : serialize(root.getRight()));
//        while (stringBuilder.lastIndexOf("#") ==  (stringBuilder.length() - 1)) {
//            stringBuilder.deleteCharAt((stringBuilder.length() - 1));
//        }
//        return stringBuilder.toString();
//    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
//    public TreeNode deserialize(final String data) {
//        // write your code here
//        if (null == data || data.isEmpty() || data.charAt(0) == '#') return null;
//        final TreeNode node = new TreeNode(data.charAt(0));
//        node.setLeft(deserialize(data.substring(1)));
//        node.setRight(deserialize(data.length() >= 2 ? data.substring(2) : null));
//        return node;
//    }
}


/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


//public class Solution {
//    /**
//     * This method will be invoked first, you should design your own algorithm
//     * to serialize a binary tree which denote by a root node to a string which
//     * can be easily deserialized by your own "deserialize" method later.
//     */
//    public String serialize(final TreeNode root) {
//        // write your code here
//        if (root == null) return null;
//        final StringBuilder builder = new StringBuilder();
//        final LinkedList<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (queue.size() > 0) {
//            final TreeNode node = queue.remove();
//            if (node != null) {
//                builder.append(node.val);
//                queue.add(node.left);
//                queue.add(node.right);
//            }
//            else
//                builder.append("#");
//
//        }
//
//        while (builder.lastIndexOf("#") == (builder.length() - 1)) {
//            builder.deleteCharAt(builder.length() - 1);
//        }
//        return builder.toString();
//    }
//
//    /**
//     * This method will be invoked second, the argument data is what exactly
//     * you serialized at method "serialize", that means the data is not given by
//     * system, it's given by your own serialize method. So the format of data is
//     * designed by yourself, and deserialize it here as you serialize it in
//     * "serialize" method.
//     */
//    public TreeNode deserialize(final String data) {
//        // write your code here
//        if (null == data || data.isEmpty()) return null;
//        final LinkedList<TreeNode> queue = new LinkedList<>();
//        final List<TreeNode> nodes = new ArrayList<>();
//        int i = 0;
//        final int length = data.length();
//        final TreeNode head = new TreeNode(data.charAt(i));
//        queue.add(head);
//        i++;
//        while (i < data.length()) {
//            final TreeNode node = queue.remove();
//            final TreeNode left = data.charAt(i) == '#' ? null : new TreeNode(data.charAt(i));
//            node.left =  left;
//            queue.add(left);
//            i++;
//            if (i < length) {
//                final TreeNode right = data.charAt(i) == '#' ? null : new TreeNode(data.charAt(i));
//                node.right = right;
//                queue.add(right);
//                i++;
//            } else {
//                node.right = null;
//            }
//
//        }
//        return head;
//    }
//}
