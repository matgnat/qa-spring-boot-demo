package interview.leetcode;

import java.util.Objects;

public class PalindromeII {

    public static void main(String[] args) {
        boolean result = isPalindrome(-10101);
        System.out.println(result);

        boolean result2 = isPalindromeNoStringConv(10101);
        System.out.println(result2);
    }

    private static boolean isPalindrome(int number) {
        if(number < 0) return false;

        String s = String.valueOf(number);
        for(int i  = 0; i < s.length(); i++){
            if(!Objects.equals(s.charAt(i), s.charAt(s.length() - 1  - i))){
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeNoStringConv(int number) {
        if(number < 0) return false;

        int initialNumber = number;
        int reverseNumber = 0;

        while(number != 0){
            int reminder = number % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            number /= 10;

        }
        return initialNumber == reverseNumber;
    }




}
