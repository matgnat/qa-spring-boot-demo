package interview.leetcode;

import interview.leetcode.dto.BinaryTree;
import interview.leetcode.dto.NodeTree;

import java.util.Objects;

public class InvertBinaryTree {

    public static void main(String[] args) {

        NodeTree initial = BinaryTree.generatorForReverse();
        System.out.println(initial);

        invertNodeTree(initial);

        System.out.println(initial);
        //System.out.println(invertedTree);

        NodeTree nodeTree = invertNodeTreeDifferentSolution(initial);
        System.out.println(nodeTree);

    }

    private static NodeTree invertNodeTreeDifferentSolution(NodeTree root) {
        if(Objects.isNull(root)) return null;

        NodeTree right = invertNodeTreeDifferentSolution(root.right);
        NodeTree left = invertNodeTreeDifferentSolution(root.left);

        root.right = left;
        root.left = right;

        return root;
    }

    private static void invertNodeTree(NodeTree tree) {

        if(Objects.nonNull(tree.right) && Objects.nonNull(tree.left)){
            NodeTree perm = tree.left;
            tree.left = tree.right;
            tree.right = perm;
            invertNodeTree(tree.left);
            invertNodeTree(tree.right);
        }

    }
}
