package algorithms.exercises.tw;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {

    private static List<Integer> indexes = new ArrayList<>();

    public static void main(String[] args) {
        int[] input1 = {7, -2, 7, 5};
        int[] input2 = {10000, -999, 7, -9, 7, 5};
        int[] input3 = {-999, 7, -9, 7, 5};

        System.out.println(maxSum(input1));
        System.out.println(indexes);
        indexes.removeAll(indexes);

        System.out.println(maxSum(input2));
        System.out.println(indexes);
        indexes.removeAll(indexes);

        System.out.println(maxSum(input3));
        System.out.println(indexes);
        indexes.removeAll(indexes);

    }

    private static int maxSum(int[] input) {

        if (input == null || input.length == 0) {
            return 0;
        }

        int result = input[0];
        int sum = input[0];
        indexes.add(0);
        for (int i = 1; i < input.length; i++) {
            if (sum <= 0) {
                sum = input[i];
                indexes.removeAll(indexes);
            } else {
                sum += input[i];
            }
            result = Math.max(result, sum);
            indexes.add(i);
            System.out.println();

        }
        if (indexes.size() == input.length) {
            int somma = 0;
            for (int x : input) {
                somma = somma + x;
            }
            if (result != somma) {
                indexes.removeAll(indexes);
                indexes.add(0);
            }
        }
        return result;
    }
}
