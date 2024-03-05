package interview.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Palindrome {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1,2,3,2,2,1));


        boolean isPal = isPalindrome(linkedList);
        System.out.println(isPal);

        boolean palindromeForLoop = isPalindromeForLoop(linkedList);
        System.out.println(palindromeForLoop);
    }

    private static boolean isPalindrome(LinkedList<Integer> linkedList) {

        while(!linkedList.isEmpty()){
            if(!Objects.equals(linkedList.getFirst(), linkedList.getLast())){
                return false;
            }
            linkedList.pollLast();
            linkedList.pollFirst();
        }

        return true;

    }

    private static boolean isPalindromeForLoop(LinkedList<Integer> linkedList) {

        for(int i  = 0; i < linkedList.size(); i++){
            if(!Objects.equals(linkedList.get(i), linkedList.get(linkedList.size() - 1 - i))){
                return false;
            }
        }

        return true;

    }


}
