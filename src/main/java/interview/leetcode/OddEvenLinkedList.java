package interview.leetcode;

import interview.leetcode.dto.ListNode;

import java.util.LinkedList;
import java.util.Objects;

public class OddEvenLinkedList {

    public static void main(String[] args) {

        ListNode generated = ListNode.generate();
        System.out.println(generated + "\n\n");

        ListNode sorted = oddSorted(generated);
        System.out.println(sorted);
    }

    //????
    private static ListNode oddSorted(ListNode root) {

        if(Objects.isNull(root)) return null;

        ListNode odd = root;
        ListNode even = root.next;
        ListNode evenHead = even;

        while (odd.next != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;

            System.out.println("root: " + root);
            System.out.println("odd: " + odd);
            System.out.println("even: " + even);
            System.out.println("\n\n");
        }
        odd.next = evenHead;

        return root;

    }


}
