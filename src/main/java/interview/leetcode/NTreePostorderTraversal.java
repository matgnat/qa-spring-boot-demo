package interview.leetcode;

import interview.leetcode.dto.Node;

import java.util.*;

public class NTreePostorderTraversal {

    public static void main(String[] args) {
        Node _5 = new Node(5);
        Node _6 = new Node(6);
        Node _2 = new Node(2);
        Node _4 = new Node(4);
        Node _3 = new Node(3, List.of(_5, _6));
        Node node = new Node(1, List.of(_3, _2, _4));

        System.out.println(node);


        List<Integer> traversalList = postOrder(node);
        System.out.println(traversalList);
    }

    private static List<Integer> postOrder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (Objects.isNull(root)) return output;

        stack.add(root);
        int i = 0;
        while (!stack.isEmpty()) {
            i++;
            Node node = stack.pollLast();
            //System.out.println("i: " + i);
            //System.out.println("node: " + node);
            output.addFirst(node.val);
            //System.out.println("output: " + output);
            //System.out.println("----------------------");
            //System.out.println("beforeAddAll stack: " + stack);
            //System.out.println("----------------------");
            stack.addAll(node.children);
            //System.out.println("addAll stack: " + stack);
            //System.out.println("==========================\n\n");
        }


        return output;
    }


    // 3-ary -> [5,6,3,2,4,1] <= postorder traversal


}
