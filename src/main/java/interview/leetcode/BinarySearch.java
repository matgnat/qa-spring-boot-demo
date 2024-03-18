package interview.leetcode;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arrayToExplore = {1,2,3,4,5,6,7,8,9,10};

        int index = findIndex(arrayToExplore, 10);
        System.out.println(index);

    }

    private static int findIndex(int[] array, int target) {

        if(array.length == 0) return -1;
        int left = 0;
        int right = array.length;

        while(left < right){
            int middle = (right + left) / 2;

            System.out.println("middle: " + middle);
            System.out.println("left: " + left);
            System.out.println("right: " + right);
            System.out.println("\n\n");

            if(array[middle] == target) {
                return middle;
            } else if (array[middle] > target){
                right = middle;
            } else if (array[middle] < target){
                left = middle;
            }


        }

        return -1;
    }
}
