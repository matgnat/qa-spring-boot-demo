package interview.leetcode;

import java.util.Arrays;

public class Island {

    public static void main(String[] args) {

        char[][] matrix = {{'1', '1', '0', '0'}, {'1', '1', '1', '1'}, {'1', '0', '0', '0'}, {'1', '1', '1', '1'}};

        //{'1', '1', '0', '0'}
        //{'0', '0', '1', '1'}
        //{'1', '0', '0', '0'}
        //{'1', '1', '1', '1'}

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '1') {
                    count++;

                    dfs(matrix, i, j);

                }

                //System.out.println(matrix[i][j]);

            }
        }

        System.out.println("\n\n============ final results: " + count);

    }

    public static void dfs(char[][] chars, int i, int j) {
        if (i < 0 || j < 0 || i >= chars.length || j >= chars[i].length || chars[i][j] != '1') {
            return;
        } else {
            chars[i][j] = '2';
            System.out.println(chars[i][j]);
            System.out.println(Arrays.deepToString(chars));

            dfs(chars, i - 1, j);
            dfs(chars, i + 1, j);
            dfs(chars, i, j - 1);
            dfs(chars, i, j + 1);
        }
    }
}
