package interview.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {
        
        int[] intArray = {1,2,3,4,5,6};

        int[] sumIndex = twoSumIndex(intArray, 10);
        System.out.println(Arrays.toString(sumIndex));

        int[] ints = twoSumIndexWithSortedArray(intArray, 8);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] twoSumIndex(int[] intArray, int sum) {
        Map<Integer, Integer> indexDigitPair = new HashMap<>();

        for(int i = 0; i < intArray.length; i++){
            int lookingInt = intArray[i];
            if(indexDigitPair.containsKey(sum - lookingInt)){
                return new int[]{indexDigitPair.get(sum - lookingInt) + 1, i + 1};
            }
            indexDigitPair.put(lookingInt, i);
        }
        return new int[]{};

    }


    private static int[] twoSumIndexWithSortedArray(int[] intArray, int sum) {
        Arrays.sort(intArray);

        int pointA = 0;
        int pointB = intArray.length - 1;

        while(pointA < pointB){

            int tempSum = intArray[pointA] + intArray[pointB];
            if(tempSum > sum){
                pointB--;
            } else if (tempSum < sum) {
                pointA++;
            } else {
                return new int[]{pointA + 1, pointB + 1};
            }
        }
        return new int[]{};
    }
}
