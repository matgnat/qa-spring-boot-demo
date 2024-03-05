package interview.leetcode.dto;

import interview.leetcode.NTreePostorderTraversal;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Node {

    public int val;
    public List<Node> children;

    public Node(int val) {
        this.val = val;
        this.children = Collections.emptyList();
    }


    public static Node generate() {
        Node _5 = new Node(5);
        Node _6 = new Node(6);
        Node _2 = new Node(2);
        Node _4 = new Node(4);
        Node _3 = new Node(3, List.of(_5, _6));
        return new Node(1, List.of(_3, _2, _4));
    }


}
