package interview.leetcode.dto;

import lombok.Data;

@Data
public class ListNode {

    public int val;
    public ListNode next;
    public ListNode(int val){
        this.val = val;
    }


    public static ListNode generate(){
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);
        ListNode node_6 = new ListNode(6);
        node_1.setNext(node_2);
        node_2.setNext(node_3);
        node_3.setNext(node_4);
        node_4.setNext(node_5);
        node_5.setNext(node_6);
        return node_1;
    }
}
