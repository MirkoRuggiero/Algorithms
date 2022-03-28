package algorithms.exercises.batch2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MaxSubArray {

    private static List<Integer> indices = new ArrayList<>();

    public static void main(String[] args) {
        int[] input1 = {7, -2, 7, 5};
        int[] input2 = {-2999, 1000, -999, 7, -9, 7, 5};
        int[] input3 = {-999, 7, -9, 7, 5};

        System.out.println(maxSum(input1));
        System.out.println(indices);
        indices.clear();

        System.out.println(maxSum(input2));
        System.out.println(indices);
        indices.clear();

        System.out.println(maxSum(input3));
        System.out.println(indices);
        indices.clear();

    }

    private static int maxSum(int[] input) {

        if (input == null || input.length == 0) {
            return 0;
        }

        int result = input[0];
        int sum = input[0];
        indices.add(0);
        for (int i = 1; i < input.length; i++) {
            if (sum <= 0) {
                sum = input[i];
                indices.clear();
            } else {
                sum += input[i];
            }
            result = Math.max(result, sum);
            indices.add(i);
            System.out.println();

        }

        if (indices.size() == input.length) {
            int s = 0;
            for (int i : input) {
                s = +i;
            }
            if (s == result) {
                for (int i : input) {
                    indices.add(i);
                }
            }
        }

        if (indices.stream().map(i -> input[i]).reduce(0, Integer::sum) != result) {
            int indexWithSingleMaxNum = IntStream.range(0, input.length).boxed()
                    .max(Comparator.comparing(i -> input[i])).get();
            indices.clear();
            indices.add(indexWithSingleMaxNum);
        }
        return result;
    }
}
