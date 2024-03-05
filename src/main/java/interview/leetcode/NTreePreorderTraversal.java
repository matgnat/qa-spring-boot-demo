package interview.leetcode;

import interview.leetcode.dto.BinaryTree;
import interview.leetcode.dto.Node;
import interview.leetcode.dto.NodeTree;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;

public class NTreePreorderTraversal {


    public static void main(String[] args) {

        Node generate = Node.generate();


        List<Integer> traversalList = preOrder(generate);
        System.out.println(traversalList);

        NodeTree generator = BinaryTree.generator();
        System.out.println(generator);

        List<Integer> input = new ArrayList<>();
        List<Integer> output = preOrderRec(input, generator);
        System.out.println(output);
    }

    private static List<Integer> preOrder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            output.add(node.val);
            List<Node> children = node.children;
            //Collections.reverse(children);
            for(int i = children.size() - 1; i > 0; i--){
                output.addLast(children.get(i).val);
            }
        }
        return output;
    }

    private static List<Integer> preOrderRec(List<Integer> output, NodeTree root){
        if(Objects.isNull(root)) return null;
        output.add(root.getKey());
        preOrderRec(output, root.left);
        preOrderRec(output, root.right);

        return output;
    }
}
