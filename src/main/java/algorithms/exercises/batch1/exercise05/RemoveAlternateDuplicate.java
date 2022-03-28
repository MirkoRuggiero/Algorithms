package algorithms.exercises.batch1.exercise05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveAlternateDuplicate {
    public static void main(String[] args) {

        String input = " aAAAAAAAAAAAAAAAAaaeEEEEEEEioooiuuuuuuuuuuuuuyyyyyyyyyyy apples trees bumblebees";
        String expectedOutput = " aAeEiouy pls tr bm";

        System.out.println(removeDuplicate(input));
        System.out.println(expectedOutput);

    }

    private static String removeDuplicate(String inputString) {

        char[] input = new char[inputString.length()];
        char[] output = new char[inputString.length()];

        inputString.getChars(0, inputString.length(), input, 0);

        Set<Character> set = new HashSet<>();
        int oIdx = 0;
        for (char c : input) {
            //spaces remain unchanged
            if (c == ' ') {
                output[oIdx] = c;
                oIdx++;
                continue;
            }
            if (!set.contains(c)) {
                set.add(c);
                output[oIdx] = c;
                oIdx++;
            }
            //do not increment oIdx if duplicate is found
        }

        return String.valueOf(Arrays.copyOfRange(output, 0, oIdx));
    }
}
