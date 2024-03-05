package interview.leetcode;

import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] toVerify = {1,2,3,4,5,5};
        System.out.println(isArrayDuplicated(toVerify));
        System.out.println(isArrayDuplicatedBaseOnHashSet(toVerify));
        System.out.println(isArrayDuplicatedBaseOnSort(toVerify));
    }

    private static boolean isArrayDuplicated(int[] toVerify) {
        Map<Integer, Integer> holdArray = new HashMap<>();

        for(int i = 0; i < toVerify.length; i++){
            if(Objects.nonNull(holdArray.get(toVerify[i]))) return true;
            holdArray.put(toVerify[i], i);
        }
        return false;

    }

    private static boolean isArrayDuplicatedBaseOnHashSet(int[] toVerify){
        HashSet<Integer> holdArray = new HashSet<>();

        for (int element : toVerify) {
            if (holdArray.contains(element)) return true;
            holdArray.add(element);
        }
        return false;
    }

    private static boolean isArrayDuplicatedBaseOnSort(int[] toVerify){
        Arrays.sort(toVerify);

        for(int i = 0; i < toVerify.length -1; i++){
            if(toVerify[i] == toVerify[i + 1]) return true;
        }
        return false;
    }

}
