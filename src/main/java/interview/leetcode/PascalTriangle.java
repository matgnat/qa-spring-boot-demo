package interview.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> lists = generatePascalTriangle(4);
    }

    static List<List<Integer>> generatePascalTriangle(int rowNumber){

        List<List<Integer>> solution = new ArrayList<>();

        if(rowNumber == 0) return solution;

        List<Integer> first_row  = new ArrayList<>();
        first_row.add(1);
        System.out.println(first_row);
        solution.add(first_row);

        for(int i  = 1; i < rowNumber; i++){

            List<Integer> previous_row = solution.get(i - 1);
            List<Integer> current_row = new ArrayList<>();
            current_row.add(1);
            for(int j = 1; j < i; j++){
                current_row.add(previous_row.get(j - 1) + previous_row.get(j));
            }
            current_row.add(1);
            System.out.println(current_row);
            solution.add(current_row);

        }

        return solution;
    }

}
