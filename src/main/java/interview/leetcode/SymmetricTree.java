package interview.leetcode;

import interview.leetcode.dto.BinaryTree;
import interview.leetcode.dto.NodeTree;

import java.util.LinkedList;

public class SymmetricTree {

    public static void main(String[] args) {

        NodeTree generator = BinaryTree.generatorSymmetric();
        boolean isSymmetric = checkIfSymmetric(generator, generator);
        System.out.println(isSymmetric);
        boolean ifSymmetricTraverse = checkIfSymmetricTraverse(generator, generator);
        System.out.println(ifSymmetricTraverse);
    }

    private static boolean checkIfSymmetric(NodeTree root1, NodeTree root2) {

        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;

        return root1.getKey() == root2.getKey() && checkIfSymmetric(root1.left, root2.right) && checkIfSymmetric(root1.right, root2.left);

    }

    private static boolean checkIfSymmetricTraverse(NodeTree root1, NodeTree root2) {

        LinkedList<NodeTree> stack1 = new LinkedList<>();
        LinkedList<NodeTree> stack2 = new LinkedList<>();

        stack1.add(root1);
        stack2.add(root2);

        while (!stack1.isEmpty() && !stack2.isEmpty()){
            NodeTree poll1 = stack1.poll();
            NodeTree poll2 = stack2.poll();

            System.out.println("stack1.poll(): " + poll1);
            System.out.println("stack2.poll(): " + poll2);
            System.out.println("\n\n");

            if(poll1 == null && poll2 == null) return true;
            if(poll1 == null || poll2 == null) return false;
            if(poll1.getKey() != poll2.getKey()) return false;
            stack1.addLast(poll1.left);
            stack1.addLast(poll1.right);

            stack2.addLast(poll2.right);
            stack2.addLast(poll2.left);

        }
        return true;
    }
}
