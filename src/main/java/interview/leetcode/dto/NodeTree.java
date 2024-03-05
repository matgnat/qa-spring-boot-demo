package interview.leetcode.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NodeTree {

    int key;
    public NodeTree left, right;

    public NodeTree(int item)
    {
        key = item;
        left = right = null;
    }

}
