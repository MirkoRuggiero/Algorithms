package algorithms.exercises.amz.exercise05;

import java.util.HashSet;
import java.util.Set;

public class RemoveAlternateDuplicate {
    public static void main(String[] args) {

        String input = "you got beautiful eyes";
        String expectedOutput = "you gt beaifl s";

        System.out.println(removeDuplicate(input));
        System.out.println(expectedOutput);

    }

    private static String removeDuplicate(String inputString) {

        char[] input = new char[inputString.length()];
        char[] output = new char[inputString.length()];

        inputString.getChars(0, inputString.length(), input, 0);

        Set<Character> set = new HashSet<>();
        int oIdx = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                output[oIdx] = input[i];
                oIdx++;
                continue;
            }
            if (!set.contains(input[i])) {
                set.add(input[i]);
                output[oIdx] = input[i];
                oIdx++;
            }

        }
        return String.valueOf(output);
    }
}
