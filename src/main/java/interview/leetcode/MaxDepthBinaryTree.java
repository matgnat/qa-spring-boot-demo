package interview.leetcode;

import interview.leetcode.dto.BinaryTree;
import interview.leetcode.dto.NodeTree;

import java.util.LinkedList;
import java.util.Objects;

public class MaxDepthBinaryTree {

    public static void main(String[] args) {

        NodeTree nodeTree = BinaryTree.generator();
        int answer = 0;
        int depth = maxDepth(nodeTree, answer);
        System.out.println("depth: " + depth);

        int depthTraverse = maxDepthTraverse(nodeTree);
        System.out.println("depthTraverse: " + depthTraverse);
    }

    private static int maxDepth(NodeTree root, int answer) {
        if(root == null){
            return answer;
        }
        NodeTree left = root.left;
        NodeTree right = root.right;
        int l = maxDepth(left, answer + 1);
        int r = maxDepth(right, answer + 1);
        return Math.max(l,r);
    }


    //not working so far
    private static int maxDepthTraverse(NodeTree root) {
        int i = 0;

        LinkedList<NodeTree> stack = new LinkedList<>();

        stack.add(root);

        while (!stack.isEmpty()) {
            NodeTree nodeTree = stack.poll();

            if(Objects.nonNull(nodeTree.left)){
                stack.add(nodeTree.left);
            } else
            if(Objects.nonNull(nodeTree.right)){
                stack.add(nodeTree.right);
            }
            i++;
        }
        return i;
    }

}
