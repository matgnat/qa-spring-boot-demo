package interview.leetcode;

import interview.leetcode.dto.BinaryTree;
import interview.leetcode.dto.NodeTree;

import java.util.LinkedList;

public class PathSum {

    public static void main(String[] args) {

        NodeTree nodeTree = BinaryTree.generator();

        boolean isSumFound = pathSum(nodeTree, 12);

        int init = 0;
        int lookingSum = 8;

        boolean isSumRec = pathSumRecursive(nodeTree, lookingSum, init);
        System.out.println(isSumRec);
    }

    private static boolean pathSum(NodeTree root, int number) {

        LinkedList<NodeTree> stack = new LinkedList<>();
        int sumLeft = 0;
        int sumRight = 0;
        if (root.getKey() > number) return false;
        if (root.getKey() == number) return true;
        stack.add(root);

        while (!stack.isEmpty()) {
            NodeTree polled = stack.poll();
            sumLeft += polled.left.getKey();
            sumRight += polled.left.getKey();

            if (sumLeft > number) return false;
            if (sumLeft == number) return true;
            if (sumRight > number) return false;
            if (sumRight == number) return true;


        }

        return false;
    }

    private static boolean pathSumRecursive(NodeTree root, int number, int sum) {
        boolean isSumFound = false;

        if (root == null) {
            System.out.println("root == null");
            return false;
        }
        if (root.getKey() > number) return false;
        if (root.getKey() == number) return true;

        System.out.println("initial sum: " + sum);

        System.out.println("key: " + root.getKey());

        sum = sum + root.getKey();

        System.out.println("current sum: " + sum);
        System.out.println("current number: " + number);

        if (sum == number && root.left == null && root.right == null) {
            System.out.println("powinienem zwrocic true");
            return true;
        }
        pathSumRecursive(root.right, number, sum);
        pathSumRecursive(root.left, number, sum);
        

        System.out.println("\n\n");


        return false;
    }
}
