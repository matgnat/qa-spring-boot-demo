package interview.leetcode.dto;

public class BinaryTree {
    NodeTree root;

    BinaryTree() {
        root = null;
    }

    public static NodeTree generator() {
        BinaryTree tree = new BinaryTree();
        tree.root = new NodeTree(1);
        tree.root.left = new NodeTree(2);
        tree.root.right = new NodeTree(3);
        tree.root.left.left = new NodeTree(4);
        tree.root.left.right = new NodeTree(5);
        return tree.root;
    }

    public static NodeTree generatorForReverse() {
        BinaryTree tree = new BinaryTree();
        tree.root = new NodeTree(1);
        tree.root.left = new NodeTree(2);
        tree.root.right = new NodeTree(7);
        tree.root.left.left = new NodeTree(1);
        tree.root.left.right = new NodeTree(3);
        tree.root.right.left = new NodeTree(6);
        tree.root.right.right = new NodeTree(9);
        return tree.root;
    }
}

