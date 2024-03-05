package interview.leetcode;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ReversedLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        System.out.println(integerLinkedList);

        Integer first = integerLinkedList.pollLast();
        System.out.println(first);
        //System.out.println(integerLinkedList);

        LinkedList<Integer> integerLinkedList1 = reverseLinkedList(integerLinkedList);
        System.out.println(integerLinkedList1);

        LinkedList<Integer> newList = new LinkedList<>();
        reverseList(integerLinkedList, newList);
        System.out.println(newList);
        

    }

    private static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (Integer l: list){
            newList.addFirst(l);
        }
        return newList;
    }

    private static void reverseList(LinkedList<Integer> oldList,LinkedList<Integer> newList){
        if(Objects.isNull(oldList.pollLast())){
            return;
        }
        newList.addLast(oldList.pollLast());
        reverseList(oldList, newList);
    }
}
