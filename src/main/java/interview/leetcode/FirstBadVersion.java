package interview.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FirstBadVersion {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(isBadVersion(5));
        System.out.println(isBadVersion(6));
        System.out.println(isBadVersion(4));
        System.out.println("first bad version: " + firstBadVersion(6));
    }

    static Integer[] getArray() {
        return new Integer[]{4, 5, 6, 7};
    }

    static int badVersion() {
        return 5;
    }

    private static boolean isBadVersion(int i) throws IllegalAccessException {
        int badV = badVersion();
        boolean load = false;
        List<Integer> array = List.of(getArray());
        List<Integer> badVersion = new ArrayList<>();

        for (Integer j : array) {
            if (j == badV) {
                load = true;
            }
            if (load) {
                badVersion.add(j);
            }
        }
        return badVersion.contains(i);
    }


    static int firstBadVersion(int i) throws IllegalAccessException {

        int left = 0;
        int right = i;

        while (left < right) {
            int middle = left + (right - left) / 2;
            System.out.println("middle: " + middle);
            System.out.println("isBadVersion: " + isBadVersion(middle));

            if (!isBadVersion(middle)) {
                left = middle + 1;
                System.out.println("left: " + left);
            } else {
                right = middle;
                System.out.println("right: " + right);
            }
            System.out.println("\n");
        }

        return left;
    }
}
