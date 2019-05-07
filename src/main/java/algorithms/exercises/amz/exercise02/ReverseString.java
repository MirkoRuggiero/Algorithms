package algorithms.exercises.amz.exercise02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReverseString {

    private static Function<List<String>, Boolean> areInverse = list -> {
        String string = list.get(0);
        String inverted = list.get(1);

        char[] charArrays = new char[6];
        char[] invertedArray = new char[6];

        string.getChars(0, string.length(), charArrays, 0);
        inverted.getChars(0, inverted.length(), invertedArray, 0);

        for (int i = 0, j = invertedArray.length - 1; i < charArrays.length; i++) {

            if (charArrays[i] != invertedArray[j]) {
                System.exit(1);
            }
            j--;
        }

        return true;
    };

    public static void main(String[] args) {
        String string = "string";
        String reversedString = "gnirts";

        if (areInverse.apply(Arrays.asList(string, reversedString))) {
            System.out.println("OK");
        }

    }
}
