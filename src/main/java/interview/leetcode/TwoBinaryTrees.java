package interview.leetcode;

import lombok.ToString;
import org.antlr.v4.runtime.tree.Tree;

import java.util.LinkedList;
import java.util.Objects;

public class TwoBinaryTrees {

    public static void main(String[] args) {
        TreeNode _7f = new TreeNode(7);
        TreeNode _5f = new TreeNode(5);
        TreeNode _4f = new TreeNode(4);
        TreeNode _3f = new TreeNode(3);
        TreeNode _2f = new TreeNode(2);
        TreeNode _1f = new TreeNode(1);

        TreeNode _7s = new TreeNode(7);
        TreeNode _5s = new TreeNode(5);
        TreeNode _4s = new TreeNode(4);
        TreeNode _3s = new TreeNode(3);
        TreeNode _2s = new TreeNode(2);
        TreeNode _1s = new TreeNode(1);

        _3f.left = _5f;
        _1f.left = _3f;
        _1f.right = _2f;

        TreeNode first = _1f;

        _1s.right = _4s;
        _3s.right = _7s;
        _2s.right = _3s;
        _2s.left = _1s;

        TreeNode second = _2s;

        System.out.println(first);
        System.out.println(second);

        TreeNode merged = mergeTwoNodes(first, second);
        System.out.println(merged);

    }

    private static TreeNode mergeTwoNodes(TreeNode first, TreeNode second) {
        if(Objects.isNull(first)) return second;
        if(Objects.isNull(second)) return first;

        first.val += second.val;
        first.left = mergeTwoNodes(first.left, second.left);
        first.right = mergeTwoNodes(first.right, second.right);

        return first;
    }


    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }

        @Override
        public String toString() {
            return String.format("(%s, %s, %s)", val, left, right);
        }

    }
}
