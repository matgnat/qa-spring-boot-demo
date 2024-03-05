package interview.leetcode;



public class ReverseInteger {
    public static void main(String[] args) {
        int newInt = reverseInt(123);
        System.out.println(newInt);
    }

    private static int reverseInt(int number) {

        int i = (number < 0) ? Math.abs(number) : number;

        int reverseInt = 0;
        int reminder;

        while( i > 0){
            reminder = i % 10;
            reverseInt = reverseInt * 10 + reminder;
            i /= 10;
        }


        return (number < 0) ? reverseInt * -1 : reverseInt;
    }
}
